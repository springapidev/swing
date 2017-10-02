package swingdemo.connection;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;

/**
 *
 * @author Rajaul Islam
 */
public class TestConnection {

    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/swing", "root", "1234");
//here sonoo is database name, root is username and password  
            Statement stmt = (Statement) con.createStatement();
            ResultSet rs = (ResultSet) stmt.executeQuery("select * from person");
            while (rs.next()) {
                System.out.println(rs.getInt(1)
                        + "  " + rs.getString(2)
                        + "  " + rs.getString(3)
                        + "  " + rs.getString(4)
                        + "  " + rs.getString(5));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
