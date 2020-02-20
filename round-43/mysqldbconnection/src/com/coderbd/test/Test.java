package com.coderbd.test;

import com.coderbd.conn.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {

    Connection conn = DbConnection.getOracleConnection();

    public void createTable() {
        String sql = "create table best( id number(5) primary key, name varchar2(50) not null,country varchar2(30) default 'BD')";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Table Created!!!");
        } catch (SQLException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertIntoBest(int id, String name, String country) {
        String sql
                = "insert into best(id, name, country) values(?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, country);
            ps.executeUpdate();
            System.out.println("Data Insert Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void updateIntoBest(int id, String name, String country) {
        String sql
                = "update best set name=?, country=? where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, country);
            ps.setInt(3, id);
            ps.executeUpdate();
            System.out.println("Data Update Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void delete(int id) {
        String sql
                = "delete from best where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Data Delete Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {
        Test t = new Test();
        //t.createTable();
        t.delete(2);
    }
}
