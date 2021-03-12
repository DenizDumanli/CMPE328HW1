//-----------------------------------------------------
// Title: User
// Author: Deniz Dumanlı
// ID: 25337236168
// Section: 1
// Description: This class has the attributes of user's.
//-----------------------------------------------------
package com.opentechnica.demo;

public class User {

    int id; // id for users
    String Name; // Name attribute for users
    String surName; // Surname attribute for users.

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    String mail;


    public User() {
        super();
    }

    // This is a constructor for user.
    public User(int i, String Name, String surName, String mail) {
        super();
        this.id = i;
        this.Name = Name;
        this.surName = surName;
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



}