package dao;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class JDBCTest {
    private static List<String> getAuthorNames() {
        List<String> authorNames = new ArrayList<>();
        try {
            // Establish connection
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                    "codeup_test_user",
                    "codeup");

            // Create statement object
            Statement statement = connection.createStatement();
            // Execute statement
            ResultSet rs = statement.executeQuery("SELECT author_name FROM codeup_test_db.authors");
            while (rs.next()){
                authorNames.add(rs.getString("author_name"));
            }

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return authorNames;
    }

    public static void main(String[] args) {
        List<String> authors = getAuthorNames();
        for(String name : authors){
            System.out.println(name);
        }
    }
}
}
