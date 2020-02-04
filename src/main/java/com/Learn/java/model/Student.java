package com.Learn.java.model;


public class Student extends Person {

    private int level;
    private String lecture;
    private String whereStudent;


    public Student (String firstName, String lastName, String lTure, String whStudent) {
        super(firstName, lastName);

        this.lecture = lTure;
        this.whereStudent = whStudent;
    }

    public void setLearn (String Learn) {
        
        int newLevel = this.level + 200;
        this.level = newLevel;
    }

    @Override
    public String getFullName () {

        if (this.level >= 500) {
            return "Prof." + " " + super.getFullName();
        }

        return super.getFullName();
    }

    public String getDetail () {

        String detail = "Name : " + this.getFullName() + "\n" + "Lecture : " + this.lecture + "\n" + "Student Location : " + this.whereStudent;
        return detail;
    }

    public int getLevel () {
        return this.level;
    }
}