package com.coderbd.service;

import com.coderbd.pojo.Student;
import java.util.List;

public interface CommonDAO {

    void save(Student obj);

    void update(Student obj);

    void delete(Student obj);

    void deleteById(int id);

    Student getById(int id);

    List<Student> findAll();
}
