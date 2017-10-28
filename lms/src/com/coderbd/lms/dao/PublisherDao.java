/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.lms.dao;

import com.coderbd.lms.domain.Publisher;
import java.util.List;

/**
 *
 * @author Rajaul Islam
 */
public interface PublisherDao {
    
     void save(Publisher s);

    void update(Publisher s);

    void delete(int id);

    List<Publisher> getList();

  
}
