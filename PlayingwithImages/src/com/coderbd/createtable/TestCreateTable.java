/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.createtable;

import com.coderbd.conn.MySqlDbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rajail Islam
 */
public class TestCreateTable {

    //static Connection conn = MySqlDbConnection.getConnection();
    static Connection conn = MySqlDbConnection.getConnection();

    public static void main(String[] args) {
        String sql = "CREATE TABLE  `swing`.`save_image` (\n"
                + "  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,\n"
                + "  `image` blob NOT NULL,\n"
                + "  PRIMARY KEY (`id`) USING BTREE\n"
                + ") ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            int i = pstm.executeUpdate();
            System.out.println(i + "Table has been created successfully!");
        } catch (SQLException ex) {
            Logger.getLogger(TestCreateTable.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
