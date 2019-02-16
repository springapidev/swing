package com.coderbd.service;

import com.coderbd.pojo.Student;

public class Test {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Minhaz");

        CommonDAO commonDAO = new StudentService();
        commonDAO.save(s1);
        
    }

}
