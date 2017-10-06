package com.coderbd.domain;

/**
 *
 * @author Mohammad Rajaul Islam
 * @url coderbd.com
 * @since 1.0.1
 */
public class Person {

    private int id;
    private String name;
    private String email;
    private String birthDate;
    private String gender;
    private String hobby;
    private String country;
    private String note;

    public Person() {
    }

    public Person(String name, String email, String birthDate, String gender, String hobby, String country, String note) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.gender = gender;
        this.hobby = hobby;
        this.country = country;
        this.note = note;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getGender() {
        return gender;
    }

    public String getHobby() {
        return hobby;
    }

    public String getCountry() {
        return country;
    }

    public String getNote() {
        return note;
    }

}
