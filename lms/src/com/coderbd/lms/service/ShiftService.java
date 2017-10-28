package com.coderbd.lms.service;

import com.coderbd.lms.connection.DbConnection;
import com.coderbd.lms.dao.ShiftDao;
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
public class ShiftService implements ShiftDao{
 Connection conn = DbConnection.getConnection();
 
 
    @Override
    public void save(Shift s) {
         try {
            if (s.getName() != null) {
               
                PreparedStatement stmt = conn.prepareStatement("insert into lms_shift(name,starting_time,ending_time,status) values(?,?,?,?)");

                stmt.setString(1, s.getName());
                stmt.setString(2, s.getStartingTime());
                stmt.setString(3, s.getEndingTime());
                stmt.setString(4,s.getStatus());
             

                int i = stmt.executeUpdate();
                System.out.println(i + " record inserted");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Shift.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Shift s) {
         try {
            if (s.getId() != 0) {
                PreparedStatement stmt = conn.prepareStatement("update lms_shift SET name=?,starting_time=?,ending_time=?,status=?  where id=?");

                stmt.setString(1, s.getName());
                stmt.setString(2, s.getStartingTime());
                stmt.setString(3, s.getEndingTime());
                stmt.setString(4, s.getStatus());
                stmt.setInt(5, s.getId());
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
                PreparedStatement stmt = conn.prepareStatement("delete from lms_shift where id=?");

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
    public List<Shift> getShifts() {
       List<Shift> list = new ArrayList<>();
        try {
            Shift p;
            PreparedStatement stmt = conn.prepareStatement("select *from lms_shift");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                p = new Shift();
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setStartingTime(rs.getString(3));
                p.setEndingTime(rs.getString(4));
                p.setStatus(rs.getString(5));
              
                list.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Shift.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
  
}
