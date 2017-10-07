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
       
         //       System.out.println("size: "+ ps.getPersons().size());
             //   ps.delete(5);
             
          //   p.setId(3);
          //   ps.update(p);
          
          //split string from comma separated
          String animals = "dog, cat, bear, elephant, giraffe";
if(animals.contains("dog")){
    System.out.println("ok");
}
String[] animalsArray = animals.split(",");
      for(String s: animalsArray){
          System.out.println(""+s);
      }
          
    }
}
