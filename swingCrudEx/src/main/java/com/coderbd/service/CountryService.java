/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.service;

import com.coderbd.connection.DbConnection;
import com.coderbd.dao.CountryDAO;
import com.coderbd.domain.Country;
import com.coderbd.domain.Person;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rajaul Islam
 */
public class CountryService implements CountryDAO {

    Connection conn = DbConnection.getConnection();

    @Override
    public Set<Country> getCountries() {
        Set<Country> list = new HashSet<>();
        try {
            Country c;
            PreparedStatement stmt = conn.prepareStatement("select *from tbl_country");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                c = new Country();
                c.setId(rs.getInt(1));
                c.setName(rs.getString(2));

                list.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public void save(Country c) {
        try {
            if (c.getName() != null) {
                PreparedStatement stmt = conn.prepareStatement("insert into tbl_country(name) values(?)");

                stmt.setString(1, c.getName());

                int i = stmt.executeUpdate();
                System.out.println(i + " records inserted");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void saveList(Set<Country> countries) {
        if (countries.size() > 0) {
            countries.forEach((c) -> {
                PreparedStatement stmt;
                try {
                    stmt = conn.prepareStatement("insert into tbl_country(name) values(?)");
                    stmt.setString(1, c.getName());
                    int i = stmt.executeUpdate();
                    System.out.println(i + " records inserted");
                } catch (SQLException ex) {
                    Logger.getLogger(CountryService.class.getName()).log(Level.SEVERE, null, ex);
                }

            });

        }
        // con.close();
    }

}
