package com.coderbd.domain.service;

import com.coderbd.conn.MySqlDbConnection;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Rajaul Islam
 */
public class TestService {

    static Connection conn = MySqlDbConnection.getConnection();
    public static void main(String[] args) {
       // File image = new File("C:\\Users\\Public\\Pictures\\Sample Pictures/hi.jpg");
        //save(image);
    }
    public static void save( File image) {
        FileInputStream fis;
        try {
            //image = new File("C:\\Users\\Public\\Pictures\\Sample Pictures/david.png");
            PreparedStatement pstm = conn.prepareStatement("insert into image(image) values(?)");
            fis = new FileInputStream(image);

            pstm.setBinaryStream(1, (InputStream) fis, (int) (image.length()));

            int s = pstm.executeUpdate();
            if (s > 0) {
                System.out.println("Uploaded successfully !");
            } else {
                System.out.println("unsucessfull to upload image.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TestService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    
      public static void getImageById(int id, JLabel lable) {
        Connection conn = MySqlDbConnection.getConnection();
        String query = "select image from image where id = ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet result = stmt.executeQuery();
            byte[] bytes = null;
            if (result.next()) {
                bytes = result.getBytes(1);
            }
            if (bytes != null) {
             
                ImageIcon icon = new ImageIcon(bytes); // you can read straight from byte array
               
               lable.setIcon(icon);
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
