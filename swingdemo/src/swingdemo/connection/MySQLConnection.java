package swingdemo.connection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rajaul Islam
 */
public class MySQLConnection {

    Connection conn = null;

    public Connection getConnections(String host, String dbName, String username, String password) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        try {
            
        String DB_URL = "jdbc:mysql://host/dbName";
            conn = (Connection) DriverManager.getConnection(DB_URL, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
