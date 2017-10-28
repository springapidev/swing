package com.coderbd.lms.service;

import com.coderbd.lms.connection.DbConnection;
import com.coderbd.lms.dao.SessonDao;
import com.coderbd.lms.domain.Sesson;
import com.coderbd.lms.domain.Shift;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Rajail Islam
 */
public class SessonService implements SessonDao{
 Connection conn = DbConnection.getConnection();
 
 
    @Override
    public void save(Sesson s) {
         try {
            if (s.getName() != null) {
               
                PreparedStatement stmt = conn.prepareStatement("insert into lms_sesson(name) values(?)");

                stmt.setString(1, s.getName());
               
             

                int i = stmt.executeUpdate();
                System.out.println(i + " record inserted");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Shift.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Sesson s) {
         try {
            if (s.getId() != 0) {
                PreparedStatement stmt = conn.prepareStatement("update lms_sesson SET name=?  where id=?");

                stmt.setString(1, s.getName());
                stmt.setInt(2, s.getId());
                int i = stmt.executeUpdate();

                System.out.println(i + " record Updated");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Shift.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int id) {
        try {
            if (id != 0) {
                PreparedStatement stmt = conn.prepareStatement("delete from lms_sesson where id=?");

                stmt.setInt(1, id);

                int i = stmt.executeUpdate();
                System.out.println(i + " record Deleted");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Shift.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Sesson> getList() {
       List<Sesson> list = new ArrayList<>();
        try {
            Sesson p;
            PreparedStatement stmt = conn.prepareStatement("select * from lms_sesson");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                p = new Sesson();
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
              
              
                list.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Shift.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
  
}
