/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.service;

import com.coderbd.conn.MySqlDbConnection;
import com.coderbd.service.domain.Country;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rajail Islam
 */
public class TestService {
    
   
     public static void saveList(Set<Country> countries) {
          Connection conn=MySqlDbConnection.getConnection();
        if (countries.size() > 0) {
            countries.forEach((c) -> {
                PreparedStatement stmt;
                try {
                    stmt = conn.prepareStatement("insert into tbl_country(name) values(?)");
                    stmt.setString(1, c.getName());
                    int i = stmt.executeUpdate();
                    System.out.println(i + " records inserted");
                } catch (SQLException ex) {
                    Logger.getLogger(TestService.class.getName()).log(Level.SEVERE, null, ex);
                }

            });

        }
     }
     
     
     public static void main(String[] args) {
        Set<Country> sets=new HashSet<>();
        sets.add(new Country("A"));
         sets.add(new Country("B"));
          sets.add(new Country("C"));
          saveList(sets);
          
    }
}
