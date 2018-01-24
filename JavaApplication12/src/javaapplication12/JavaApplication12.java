/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.Random;
import static java.lang.Math.random;
/**
 *
 * @author Instructor
 */
public class JavaApplication12 extends Object{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
       double dd=random();
        System.out.println("Random: "+dd);
       
        int x=10;
        int y=x - Math.decrementExact(2);
        System.out.println("Rs: "+y);
         new JavaApplication12();
         
         Random r=new Random();
         int xx=r.nextInt(25);
         System.out.println("X: "+xx);
    }
    
public JavaApplication12() {
        System.out.println("Con.......");
    }
    
    static {
        System.out.println("hi.....");
    }
    
    
}
