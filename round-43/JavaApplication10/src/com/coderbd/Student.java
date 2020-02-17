package com.coderbd;

public class Student {

    private int serial;
    private String name;
    private String email;
    private String gender;
    private String hobby;
    private String round;

    public Student() {
    }

    public Student(int serial, String name, String email, String gender, String hobby, String round) {
        this.serial = serial;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.hobby = hobby;
        this.round = round;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public int getSerial() {
        return serial;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getHobby() {
        return hobby;
    }

    public String getRound() {
        return round;
    }

    @Override
    public String toString() {
        return "Student{" + "serial=" + serial + ", name=" + name + ", email=" + email + ", gender=" + gender + ", hobby=" + hobby + ", round=" + round + '}';
    }

}
