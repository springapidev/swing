package com.coderbd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestDbCon {
    
    public static void main(String[] args) {
        DbConnection.getCon();
        //createYasinTable();
        insertYasinTable("Mr Shetu");
        getListYasinTable();
        
    }
    
    public static void createYasinTable() {
        try {
            Connection con = DbConnection.getCon();
            PreparedStatement pstm = con.prepareStatement("create table yasin(id int(11) primary key auto_increment, name varchar(25))");
            pstm.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(TestDbCon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void insertYasinTable(String name) {
        try {
            Connection con = DbConnection.getCon();
            PreparedStatement pstm = con.prepareStatement("insert into yasin(name) values(?)");
            pstm.setString(1, name);
            pstm.executeUpdate();
            System.out.println("Insert Success");
            
        } catch (SQLException ex) {
            Logger.getLogger(TestDbCon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void getListYasinTable() {
        try {
            Connection con = DbConnection.getCon();
            PreparedStatement pstm = con.prepareStatement("select * from yasin");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                System.out.println("Name: " + rs.getString(2));
            }
            
            System.out.println("Insert Success");
            
        } catch (SQLException ex) {
            Logger.getLogger(TestDbCon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
