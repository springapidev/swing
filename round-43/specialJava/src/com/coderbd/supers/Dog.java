package com.coderbd.supers;

public class Dog extends Animal {

    private String name;

    public Dog() {
        super();// called super clas
        System.out.println("Dog instantiated........");
    }

    public Dog(String name, int id, String race) {
        super(id, race);
        this.name = name;
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.name + " ");
    }

    public void display() {
        System.out.println(super.id);// call praent class
        super.makeSound();

    }
}
