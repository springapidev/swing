package com.coderbd.lms.domain;


/**
 *
 * @author Rajaul Islam
 */
public class Sesson {
    private int id;
    private String name;

    public Sesson() {
    }

    public Sesson(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    
    
}
