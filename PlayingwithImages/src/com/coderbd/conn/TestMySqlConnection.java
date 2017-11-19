package com.coderbd.conn;

import java.sql.Connection;

/**
 *
 * @author Rajail Islam
 */
public class TestMySqlConnection {
    public static void main(String[] args) {
        Connection conn=MySqlDbConnection.getConnection();
    }
 
}
