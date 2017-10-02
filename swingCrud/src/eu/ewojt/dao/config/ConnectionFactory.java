/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ewojt.dao.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author iwonaw
 */
public class ConnectionFactory {

    //DB settings
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String CONNECTION = "jdbc:mysql://localhost/swing";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    public Connection getSQLConnection() {
        Connection conn = null;
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            System.err.println("No JDBC Driver!");
            e.printStackTrace();
        }
        try {
            conn = DriverManager.getConnection(CONNECTION, USER, PASSWORD);
        } catch (SQLException e) {
            System.err.println("DB connection problem");
            e.printStackTrace();
        }
        return conn;
    }
}
