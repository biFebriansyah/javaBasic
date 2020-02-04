package com.Learn.java.model;

/**
 * Person
 */
public class Person {

    public static final String _VERSION = "1.0.1";
    private String firstName;
    private String lastName;

    public Person(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public void showAppVersion() {
        System.out.println(_VERSION);
    }


}