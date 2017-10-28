package com.coderbd.lms.service;

import com.coderbd.lms.connection.DbConnection;
import com.coderbd.lms.dao.AuthorDao;
import com.coderbd.lms.dao.Departmentdao;
import com.coderbd.lms.domain.Author;
import com.coderbd.lms.domain.Department;
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
public class DepartmentService implements Departmentdao{
 Connection conn = DbConnection.getConnection();
 
 
    @Override
    public void save(Department s) {
         try {
            if (s.getName() != null) {
           
                PreparedStatement stmt = conn.prepareStatement("insert into lms_author(name) values(?)");

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
    public void update(Department s) {
         try {
            if (s.getId() != 0) {
                PreparedStatement stmt = conn.prepareStatement("update lms_author SET name=?  where id=?");

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
                PreparedStatement stmt = conn.prepareStatement("delete from lms_author where id=?");

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
    public List<Department> getList() {
       List<Department> list = new ArrayList<>();
        try {
            Department p;
            PreparedStatement stmt = conn.prepareStatement("select *from lms_author");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                p = new Department();
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
