/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.lms.service;

import com.coderbd.lms.connection.DbConnection;
import com.coderbd.lms.dao.BookRecieveDao;
import com.coderbd.lms.domain.BookIssue;
import com.coderbd.lms.domain.BookReceive;
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
public class BookReceiveService implements BookRecieveDao {

    Connection conn = DbConnection.getConnection();

    @Override
    public void save(BookReceive s) {
        try {
            if (s.getStudentId() != 0) {

                PreparedStatement stmt = conn.prepareStatement("insert into lms_book_receive(book_id,student_id,return_date,qty,status ) values(?,?,?,?,?)");

                stmt.setInt(1, s.getBookId());
                stmt.setInt(2, s.getStudentId());
                stmt.setString(3, s.getReturnDate());
                stmt.setInt(4, s.getQty());
                stmt.setString(5, s.getStatus());

                int i = stmt.executeUpdate();
                System.out.println(i + " record inserted");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Shift.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<BookReceive> getList() {
      List<BookReceive> list = new ArrayList<>();
        try {
            BookReceive p;
            PreparedStatement stmt = conn.prepareStatement("select * from lms_book_receive");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                p = new BookReceive();
                p.setId(rs.getInt(1));
                p.setBookId(rs.getInt(2));
                p.setStudentId(rs.getInt(3));
                p.setReturnDate(rs.getString(4));
                p.setQty(rs.getInt(5));
                p.setStatus(rs.getString(6));

                list.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookIssue.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
