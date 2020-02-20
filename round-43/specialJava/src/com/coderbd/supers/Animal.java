package com.coderbd.supers;

class Animal {

    public int id;
private String race;
    public Animal() {
        System.out.println("Animal instantiated..........");
    }

    public Animal(int id) {
        this.id = id;
    }

    public Animal(int id, String race) {
        this.id = id;
        this.race = race;
    }
public void makeSound(){
    System.out.println("make ...........sound");
}
}
