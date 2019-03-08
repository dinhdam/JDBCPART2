package com.entities;

public class Person {
    private int id;
    private  String firstName;
    private String lastName;
    public Person(){

    }
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public  String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
}
