/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.lms.dao;

import com.coderbd.lms.domain.BookReceive;
import java.util.List;

/**
 *
 * @author Rajail Islam
 */
public interface BookRecieveDao {
   void save(BookReceive s);
    List<BookReceive> getList(); 
}
