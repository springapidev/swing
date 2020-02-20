package com.coderbd;

public class ThisEx {

    private int id;// instance variable
    private String name;

    public ThisEx(int id) {
        this.id = id;//1. this refers to current class instance
    }

    public ThisEx(String name, int id) {
        this(id);// 2. this refers to current class constructor
        this.name = name;
    }

    public void printDetails() {
        this.sayHi();//3. current class method
    }

    public void sayHi() {
        System.out.println("Hi.......");
    }
}
