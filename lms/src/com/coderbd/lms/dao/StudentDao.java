/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.lms.dao;

import com.coderbd.lms.domain.Student;
import com.coderbd.lms.domain.User;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Rajaul Islam
 */
public interface StudentDao {

    void save(Student s);

    void update(Student s);

    void delete(int id);

    List<Student> getList();
      Set<Student> getStudentList();

    Student getStudent(int id);

    Student getUserByRegistrationNo(int registrationNo);
}
