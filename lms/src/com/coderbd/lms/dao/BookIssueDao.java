/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.lms.dao;

import com.coderbd.lms.domain.BookIssue;
import java.util.List;

/**
 *
 * @author Rajail Islam
 */
public interface BookIssueDao {
   void save(BookIssue b);

    void update(BookIssue b);

    void delete(int id);

    List<BookIssue> getList(); 
}
