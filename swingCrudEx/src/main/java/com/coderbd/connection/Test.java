package com.coderbd.connection;

import com.coderbd.domain.Person;
import com.coderbd.service.PersonService;

/**
 *
 * @author Rajail Islam
 */
public class Test {

    private static PersonService ps;

    public static void main(String[] args) {
       // Connection conn = DbConnection.getConnection();

        Person p = new Person("Reza", "springapidev@gmail.com", "01-01-1980", "Male", "Read, Write, Code", "BD", "Wow");
        ps = new PersonService();
       // ps.save(p);
       
                System.out.println("size: "+ ps.getPersons().size());
             //   ps.delete(5);
             
             p.setId(4);
             ps.update(p);
    }
}
