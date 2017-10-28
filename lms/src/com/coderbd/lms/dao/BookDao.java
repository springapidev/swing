package com.coderbd.lms.dao;

import com.coderbd.lms.domain.Book;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Rajaul Islam
 */
public interface BookDao {
    
     void save(Book book);

    void update(Book book);

    void delete(int id);

    List<Book> getList();
    Set<Book> getBookList();
  Book getBookById(int id);
}
