package com.coderbd.lms.connection;


import com.coderbd.lms.domain.User;
import com.coderbd.lms.service.UserService;
import java.sql.Connection;

/**
 *
 * @author Rajail Islam
 */
public class Test {
 
    public static void main(String[] args) {
        Connection conn = DbConnection.getConnection();

        UserService us=new UserService();
       User u= us.getUserByUsername("admin");
        System.out.println("uname: "+u.getName());
    }
}
