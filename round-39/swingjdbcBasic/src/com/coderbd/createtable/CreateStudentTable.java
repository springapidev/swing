package com.coderbd.createtable;

import com.coderbd.connection.DblConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateStudentTable {

    static Connection con = DblConnection.getDbConnection();

    public static void createStudentTable() {
        String sql = "create table student(id int(11) primary key auto_increment, name varchar(50) not null)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println("Student Table Created");

        } catch (SQLException ex) {
            Logger.getLogger(CreateStudentTable.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
