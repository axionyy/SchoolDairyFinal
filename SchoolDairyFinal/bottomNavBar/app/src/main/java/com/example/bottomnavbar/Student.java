package com.example.bottomnavbar;

import androidx.annotation.NonNull;

public class Student {

    private int id;
    private String login, password, firstName, middleName, lastName, birtsday, classs;

    public Student() {
    }

    public Student(int id, String login, String password, String firstName, String middleName, String lastName, String birtsday, String classs) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birtsday = birtsday;
        this.classs = classs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirtsday() {
        return birtsday;
    }

    public void setBirtsday(String birtsday) {
        this.birtsday = birtsday;
    }


    public String getClasss(){
        return classs;
    }

    public void setClass(String aClass) {
        classs = aClass;
    }
}
