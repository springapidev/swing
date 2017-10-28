/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.lms.service;

import com.coderbd.lms.connection.DbConnection;
import java.sql.Connection;
import java.util.List;
import com.coderbd.lms.dao.UserDao;
import com.coderbd.lms.domain.Shift;
import com.coderbd.lms.domain.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rajail Islam
 */
public class UserService implements UserDao {

    Connection conn = DbConnection.getConnection();

    @Override
    public void save(User s) {
        try {
            if (s.getUsername() != null) {

                PreparedStatement stmt = conn.prepareStatement("insert into lms_user(name,email,mobile, username,password,user_type) values(?,?,?,?,?,?)");

                stmt.setString(1, s.getName());
                stmt.setString(2, s.getEmail());
                stmt.setString(3, s.getMobile());
                stmt.setString(4, s.getUsername());
                stmt.setString(5, s.getPassword());
                stmt.setString(6, s.getUserType());

                int i = stmt.executeUpdate();
                System.out.println(i + " record inserted");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Shift.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(User s) {
        try {
            if (s.getId() != 0) {
                PreparedStatement stmt = conn.prepareStatement("update lms_user SET name=?,email=?,mobile=?,username=?, password=?, user_type=?  where id=?");

                stmt.setString(1, s.getName());
                stmt.setString(2, s.getEmail());
                stmt.setString(3, s.getMobile());
                stmt.setString(4, s.getUsername());
                stmt.setString(5, s.getPassword());
                stmt.setString(6, s.getUserType());
                stmt.setInt(7, s.getId());
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
                PreparedStatement stmt = conn.prepareStatement("delete from lms_user where id=?");

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
    public List<User> getList() {
        List<User> list = new ArrayList<>();
        try {
            User p;
            PreparedStatement stmt = conn.prepareStatement("select * from lms_user");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                p = new User();
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setEmail(rs.getString(3));
                p.setMobile(rs.getString(4));
                p.setUsername(rs.getString(5));
                p.setPassword(rs.getString(6));
                p.setUserType(rs.getString(7));
                list.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Shift.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public User getUser(int id) {
        User p = new User();
        try {

            PreparedStatement stmt = conn.prepareStatement("select * from lms_user where id=?");
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setEmail(rs.getString(3));
                p.setMobile(rs.getString(4));
                p.setUsername(rs.getString(5));
                p.setPassword(rs.getString(6));
                p.setUserType(rs.getString(7));

            }

        } catch (SQLException ex) {
            Logger.getLogger(Shift.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }

    @Override
    public User getUserByUsername(String username) {
        User p = new User();
        try {

            PreparedStatement stmt = conn.prepareStatement("select * from lms_user where username=?");
            stmt.setString(1, username);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setEmail(rs.getString(3));
                p.setMobile(rs.getString(4));
                p.setUsername(rs.getString(5));
                p.setPassword(rs.getString(6));
                p.setUserType(rs.getString(7));

            }

        } catch (SQLException ex) {
            Logger.getLogger(Shift.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }

}
