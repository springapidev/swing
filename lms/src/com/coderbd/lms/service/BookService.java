package com.coderbd.lms.service;


import com.coderbd.lms.connection.DbConnection;
import com.coderbd.lms.dao.BookDao;
import com.coderbd.lms.domain.Book;

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
 * @author anik
 */
public class BookService implements BookDao{
    
    Connection connect=DbConnection.getConnection();
    
    @Override
    public void save(Book book) {

        try {

            if (book.getName() != null) {

                PreparedStatement stmt = connect.prepareStatement("INSERT INTO lms_book(name,book_code,author,publisher,edition,unit_price,qty,total_price,rack_no,issn_no,category,purchase_date) values(?,?,?,?,?,?,?,?,?,?,?,?)");

                stmt.setString(1, book.getName());
                stmt.setString(2, book.getBookCode());
                stmt.setString(3, book.getAuthor());
                stmt.setString(4, book.getPublisher());
                stmt.setString(5, book.getEdition());
                stmt.setInt(6, (int)book.getUnitPrice());
                stmt.setInt(7, book.getQty());
                stmt.setInt(8, (int)book.getTotalPrice());
                stmt.setString(9, book.getRackNo());
                stmt.setString(10, book.getIssnNo());
                stmt.setString(11, book.getCategory());
                stmt.setString(12, book.getPurchaseDate());

                stmt.executeUpdate();
            }

        } catch (SQLException e) {
            Logger.getLogger(InstituteService.class.getName()).log(Level.SEVERE, null, e);
        }

    }
    
    
    
    @Override
    public void update(Book book) {

        try {

            if (book.getId() != 0) {

               PreparedStatement statement = connect.prepareStatement("UPDATE lms_book SET name=?,book_code=?,author=?,publisher=?,edition=?,unit_price=?,qty=?,total_price=?,rack_no=?,issn_no=?,category=?,purchase_date=? WHERE id=?");

                statement.setString(1, book.getName());
                statement.setString(2, book.getBookCode());
                statement.setString(3, book.getAuthor());
                statement.setString(4, book.getPublisher());
                statement.setString(5, book.getEdition());
                statement.setInt(6, (int)book.getUnitPrice());
                statement.setInt(7, book.getQty());
                statement.setInt(8, (int)book.getTotalPrice());
                statement.setString(9, book.getRackNo());
                statement.setString(10, book.getIssnNo());
                statement.setString(11, book.getCategory());
                statement.setString(12, book.getPurchaseDate());
                statement.setInt(13, book.getId());

                statement.executeUpdate();

            }

        } catch (SQLException e) {
            Logger.getLogger(InstituteService.class.getName()).log(Level.SEVERE, null, e);
        }

    }
    
    
    
    @Override
    public void delete(int id) {

        try {

            PreparedStatement statement = connect.prepareStatement("DELETE FROM lms_book WHERE id=?");
            
            statement.setInt(1, id);
            statement.executeUpdate();
            
        } catch (SQLException e) {
            Logger.getLogger(InstituteService.class.getName()).log(Level.SEVERE, null, e);
        }

    }
    
    
    
    @Override
    public List<Book> getList() {

        List<Book> list = new ArrayList<>();
        
        try {

            PreparedStatement statement = connect.prepareStatement("SELECT * FROM lms_book");
            ResultSet result = statement.executeQuery();


            while (result.next()) {
                
                Book book=new Book();
                
                book.setId(result.getInt(1));
                book.setName(result.getString(2));
                book.setBookCode(result.getString(3));
                book.setAuthor(result.getString(4));
                book.setPublisher(result.getString(5));
                book.setEdition(result.getString(6));
                book.setUnitPrice(result.getInt(7));
                book.setQty(result.getInt(8));
                book.setTotalPrice(result.getInt(9));
                book.setRackNo(result.getString(10));
                book.setIssnNo(result.getString(11));
                book.setCategory(result.getString(12));
                book.setPurchaseDate(result.getString(13));
                
                list.add(book);
            }

        } catch (SQLException e) {
            Logger.getLogger(InstituteService.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }
    
    
     @Override
    public Set<Book> getBookList() {
        Set<Book> list = new HashSet<>();
        try {
            Book c;
            PreparedStatement stmt = connect.prepareStatement("select *from lms_book");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                c = new Book();
                c.setId(rs.getInt(1));
                c.setName(rs.getString(2));
                 c.setBookCode(rs.getString(3));

                list.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Book getBookById(int id) {
        Book p = new Book();
        try {

            PreparedStatement stmt = connect.prepareStatement("select * from lms_book where id=?");
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
              p.setBookCode(rs.getString(3));

            }

        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }
    
}
