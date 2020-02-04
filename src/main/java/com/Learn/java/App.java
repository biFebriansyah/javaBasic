package com.Learn.java;

import com.Learn.java.Service.onlineCourse.onlineCourse;
import com.Learn.java.model.Student;
import com.Learn.java.model.App2d;
import com.Learn.java.model.CompanyImpl;;

public class App
{
    App() {

        Student ebi = new Student("Muhammad", "Febriansyah", "Prof.Ai", "Palu");

        ebi.setLearn("Java");
        ebi.setLearn("Docker");
        ebi.setLearn("Spring Boot");

        onlineCourse test = new onlineCourse(ebi);
        // test.login();
        test.takeCourse("Java");

        CompanyImpl cmp = new CompanyImpl();
        cmp.addPrimary("Indonesia", "Jakarta", "Jakarta Utara", "Jln.Tebet Raya");
        // cmp.showDetail();

        App2d twoDApp = new App2d();
        twoDApp.addShape("kubus");
        twoDApp.drawShape("kubus");
    }

    public static void main( String[] args )
    {
        new App();
    }
}
