package com.Learn.java.Service.onlineCourse;

import com.Learn.java.model.Student;

/**
 * onlineCourse
 */
public class onlineCourse {

    private String name;
    private boolean isLogin = false;

    public onlineCourse(Student student) {

        this.name = student.getFullName();
    }

    public void login() {

        if (this.name != null) {
            this.isLogin = true;
            System.out.println("Login succses");
        } else {
            System.out.println("Login failed");
        }
    }

    public void takeCourse (String courseName) {
        if (this.isLogin) {
            System.out.println("take course" + courseName + " " + "succsess");
        } else {
            System.out.println("Anda belum Login");
        }
    }
}