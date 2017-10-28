package com.coderbd.lms.domain;

import java.util.Date;

/**
 *
 * @author Rajail Islam
 */
public class Edition {

    private int id;
    private String name;
  

    public Edition() {
    }

    public Edition(String name) {
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
