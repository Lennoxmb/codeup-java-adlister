package dao;

import com.mysql.cj.jdbc.Driver;
import models.Author;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AuthorsDao implements Authors {

    private final Connection connection;

    public AuthorsDao(Config config){
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(config.getUrl(),
                    config.getUser(),
                    config.getPassword());
        } catch (SQLException sqle){
            throw new RuntimeException("Error connecting to db", sqle);
        }
    }

    public AuthorsDao(Connection connection) {

        this.connection = connection;
    }

    @Override
    public List<Author> all() {
        List<Author> authors = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            // Execute statement
            ResultSet resultSet = statement.executeQuery("SELECT * FROM bigfoot_test_db.authors");
            while (resultSet.next()) {
                Author author = new Author(
                        resultSet.getLong("id"),
                        resultSet.getString("name")
                );
                authors.add(author);
            }
        } catch (SQLException sqlx){
            throw new RuntimeException("error connecting to db", sqlx);
        }
        return authors;
    }

    @Override
    public Author getOneAuthor(int id) {
        return null;
    }


    @Override
    public void insert(Author author) {
        String author_name = author.getAuthor_name();
        String query = "INSERT INTO codeup_test_db.authors (author_name) VALUES ('" + author_name + "')";
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            rs.next();
            long key = rs.getLong(1);
            System.out.println("The key of the new insert is: " + key);
            return key;
        } catch (SQLException sqle){
            throw new RuntimeException("error connecting to db", sqle);
        }
    }

    @Override
    public Author getOneAuthorByName(String author_name){
        Author author;
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM codeup_test_db.authors WHERE author_name='" + author_name + "'");
            if (rs.next()) {
                return new Author(rs.getInt("id"), rs.getString("author_name"));
            } else {
                return null;
            }
        } catch (SQLException sqle){
            throw new RuntimeException("error connecting to db", sqle);
        }
    }
}