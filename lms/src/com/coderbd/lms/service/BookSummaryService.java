package com.coderbd.lms.service;

import com.coderbd.lms.connection.DbConnection;
import com.coderbd.lms.dao.BookSummaryDao;
import com.coderbd.lms.domain.BookSummary;
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
public class BookSummaryService implements BookSummaryDao {

    Connection conn = DbConnection.getConnection();

    @Override
    public void saveWhenBookPurchase(BookSummary s) {
        try {
            if (s.getBookCode() != null) {

                PreparedStatement stmt = conn.prepareStatement("insert into lms_book_summary(book_code,book_name,total_stock,avilable_stock,already_lend,lost_qty) values(?,?,?,?,?,?)");

                stmt.setString(1, s.getBookCode());
                stmt.setString(2, s.getBookName());
                stmt.setInt(3, s.getTotalStock());
                stmt.setInt(4, s.getAvilableStock());
                stmt.setInt(5, s.getAlreadyLend());
                stmt.setInt(6, s.getLostQty());

                int i = stmt.executeUpdate();
                System.out.println(i + " record inserted");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Shift.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(BookSummary s) {
        try {
            if (s.getId() != 0) {

                PreparedStatement stmt = conn.prepareStatement("update lms_book_summary SET total_stock=?,avilable_stock=?,already_lend=? where id=?");
                stmt.setInt(1, s.getTotalStock());
                stmt.setInt(2, s.getAvilableStock());
                stmt.setInt(3, s.getAlreadyLend());
                stmt.setInt(4, s.getId());
                int i = stmt.executeUpdate();

                System.out.println(i + " record Updated");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Shift.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateWhenBookPurchase(BookSummary s) {
        try {
            if (s.getId() != 0) {

                PreparedStatement stmt = conn.prepareStatement("update lms_book_summary SET total_stock=?,avilable_stock=? where id=?");
                stmt.setInt(1, s.getTotalStock());
                stmt.setInt(2, s.getAvilableStock());
                stmt.setInt(3, s.getId());
                int i = stmt.executeUpdate();

                System.out.println(i + " record Updated");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Shift.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<BookSummary> getList() {
        List<BookSummary> list = new ArrayList<>();
        try {
            BookSummary p;
            PreparedStatement stmt = conn.prepareStatement("select * from lms_book_summary");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                p = new BookSummary();
                p.setId(rs.getInt(1));
                p.setBookCode(rs.getString(2));
                p.setBookName(rs.getString(3));
                p.setTotalStock(rs.getInt(4));
                p.setAvilableStock(rs.getInt(5));
                p.setAlreadyLend(rs.getInt(6));
                p.setLostQty(rs.getInt(7));

                list.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Shift.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public BookSummary getBookSummaryByBookCode(String bookCode) {
        BookSummary p = new BookSummary();
        try {

            PreparedStatement stmt = conn.prepareStatement("select * from lms_book_summary where book_code=?");
            stmt.setString(1, bookCode);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                p.setId(rs.getInt(1));
                p.setBookCode(rs.getString(2));
                p.setBookName(rs.getString(3));
                p.setTotalStock(rs.getInt(4));
                p.setAvilableStock(rs.getInt(5));
                p.setAlreadyLend(rs.getInt(6));
                p.setLostQty(rs.getInt(7));

            }

        } catch (SQLException ex) {
            Logger.getLogger(BookSummary.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }

    @Override
    public BookSummary getBookSummaryById(int id) {
          BookSummary p = new BookSummary();
        try {

            PreparedStatement stmt = conn.prepareStatement("select * from lms_book_summary where id=?");
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                p.setId(rs.getInt(1));
                p.setBookCode(rs.getString(2));
                p.setBookName(rs.getString(3));
                p.setTotalStock(rs.getInt(4));
                p.setAvilableStock(rs.getInt(5));
                p.setAlreadyLend(rs.getInt(6));
                p.setLostQty(rs.getInt(7));

            }

        } catch (SQLException ex) {
            Logger.getLogger(BookSummary.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }

}
