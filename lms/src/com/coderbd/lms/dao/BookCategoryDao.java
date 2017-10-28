/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.lms.dao;

import com.coderbd.lms.domain.BookCategory;
import java.util.List;

/**
 *
 * @author Rajaul Islam
 */
public interface BookCategoryDao {
    
     void save(BookCategory s);

    void update(BookCategory s);

    void delete(int id);

    List<BookCategory> getList();

  
}
