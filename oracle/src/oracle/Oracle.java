package oracle;

import com.coderbd.connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author J2EE-33
 */
public class Oracle {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Connection con = DbConnection.getConnection("xe","hr","hr");
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("select * from employees");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2)+ "  " + rs.getString(3)+ "  " + rs.getString(4)+ "  " + rs.getString(5));
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Oracle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
