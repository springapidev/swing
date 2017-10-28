/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.lms.dao;

import com.coderbd.lms.domain.Institute;
import java.util.List;

/**
 *
 * @author Rajail Islam
 */
public interface InstituteDao {
        
     void save(Institute institute);

    void update(Institute institute);

    void delete(int id);

    List<Institute> getList();

}
