package dao;

import com.mysql.cj.jdbc.Driver;
import models.Author;
import models.Quote;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QuotesDao implements Quotes {

    private final Connection connection;

    public QuotesDao(Config config){
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(config.getUrl(),
                    config.getUser(),
                    config.getPassword());
        } catch (SQLException sqle){
            throw new RuntimeException("Error connecting to db", sqle);
        }
    }

    @Override
    public List<Quote> all() {
        List<Quote> quotes = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM codeup_test_db.quotes");
            while (rs.next()){
                int author_id = rs.getInt("author_id");
                Authors authorsDao = DaoFactory.getAuthorsDao();
                Author quoteAuthor = authorsDao.getOneAuthor(author_id);
                Quote quote = new Quote(
                        rs.getInt("id"),
                        rs.getString("content"),
                        quoteAuthor
                );
                quotes.add(quote);
            }
        } catch (SQLException sqle){
            throw new RuntimeException("error connecting to db", sqle);
        }
        return quotes;
    }

    @Override
    public Long insert(Quote quote) {
        String content = quote.getContent();
        long author_id = quote.getAuthor().getId();
        String query = "INSERT INTO codeup_test_db.quotes (content, author_id) VALUES ('" + content + "', " + author_id + ")";
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
}