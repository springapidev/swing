package com.coderbd.lms.service;

import com.coderbd.lms.connection.DbConnection;
import com.coderbd.lms.dao.BookIssueDao;
import com.coderbd.lms.domain.BookIssue;
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
public class BookIssueService implements BookIssueDao {

    Connection conn = DbConnection.getConnection();

    @Override
    public void save(BookIssue s) {
        try {
            if (s.getStudentId() != 0) {

                PreparedStatement stmt = conn.prepareStatement("insert into lms_book_issue(book_id,student_id,issue_date,expire_date,return_date,qty,status ) values(?,?,?,?,?,?,?)");

                stmt.setInt(1, s.getBookId());
                stmt.setInt(2, s.getStudentId());
                stmt.setString(3, s.getIssueDate());
                stmt.setString(4, s.getExpireDate());
                stmt.setString(5, s.getReturnDate());
                stmt.setInt(6, s.getQty());
                stmt.setString(7, s.getStatus());

                int i = stmt.executeUpdate();
                System.out.println(i + " record inserted");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Shift.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(BookIssue s) {
        try {
            if (s.getId() != 0) {
                PreparedStatement stmt = conn.prepareStatement("update lms_book_issue SET name=?  where id=?");
                stmt.setInt(1, s.getBookId());
                stmt.setInt(2, s.getStudentId());
                stmt.setString(3, s.getIssueDate());
                stmt.setString(4, s.getExpireDate());
                stmt.setString(5, s.getReturnDate());
                stmt.setInt(6, s.getQty());
                stmt.setString(7, s.getStatus());
                stmt.setInt(8, s.getId());
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
                PreparedStatement stmt = conn.prepareStatement("delete from lms_book_issue where id=?");

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
    public List<BookIssue> getList() {
        List<BookIssue> list = new ArrayList<>();
        try {
            BookIssue p;
            PreparedStatement stmt = conn.prepareStatement("select * from lms_book_issue");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                p = new BookIssue();
                p.setId(rs.getInt(1));
                p.setBookId(rs.getInt(2));
                p.setStudentId(rs.getInt(3));
                p.setIssueDate(rs.getString(4));
                p.setExpireDate(rs.getString(5));
                p.setReturnDate(rs.getString(6));
                p.setQty(rs.getInt(7));
                p.setStatus(rs.getString(8));

                list.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookIssue.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
