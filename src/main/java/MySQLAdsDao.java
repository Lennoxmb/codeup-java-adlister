import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class MySQLAdsDao implements Ads{
    @Override
    public List<Ad> all() {
        return null;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }

    public MySQLAdsDao(Config config) throws SQLException {
        //class should have a private instance property named connection of type Connection that is initialized in the constructor. Define your constructor so that it accepts an instance of your Config class so that it can obtain the database credential
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://" + config.getUrl() + "/" + config.getDatabaseName(),
                config.getUser(),
                config.getPassword()
        );
    }

}
