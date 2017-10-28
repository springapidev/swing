/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.lms.dao;

import com.coderbd.lms.domain.User;
import java.util.List;

/**
 *
 * @author Rajaul Islam
 */
public interface UserDao {

    void save(User s);

    void update(User s);

    void delete(int id);

    List<User> getList();

    User getUser(int id);
    
     User getUserByUsername(String username);
}
