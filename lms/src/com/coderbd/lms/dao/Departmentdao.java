/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.lms.dao;

import com.coderbd.lms.domain.Department;
import java.util.List;

/**
 *
 * @author Rajaul Islam
 */
public interface Departmentdao {
    
     void save(Department s);

    void update(Department s);

    void delete(int id);

    List<Department> getList();

  
}
