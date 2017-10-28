package com.coderbd.lms.service;

import com.coderbd.lms.connection.DbConnection;
import com.coderbd.lms.dao.EditionDao;
import com.coderbd.lms.domain.Edition;
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
public class EditionService implements EditionDao{
 Connection conn = DbConnection.getConnection();
 
 
    @Override
    public void save(Edition s) {
         try {
            if (s.getName() != null) {
               
                PreparedStatement stmt = conn.prepareStatement("insert into lms_edition(name) values(?)");

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
    public void update(Edition s) {
         try {
            if (s.getId() != 0) {
                PreparedStatement stmt = conn.prepareStatement("update lms_edition SET name=?  where id=?");

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
                PreparedStatement stmt = conn.prepareStatement("delete from lms_edition where id=?");

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
    public List<Edition> getList() {
       List<Edition> list = new ArrayList<>();
        try {
            Edition p;
            PreparedStatement stmt = conn.prepareStatement("select *from lms_edition");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                p = new Edition();
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
