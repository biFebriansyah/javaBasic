package com.Learn.java;
import com.Learn.java.Service.onlineCourse.onlineCourse;
import com.Learn.java.model.Student;
import com.Learn.java.model.CompanyImpl;
import com.Learn.java.model.GenericClass;

public class main
{
    main() {

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

        // App2dImpl twoDApp = new App2dImpl();
        // twoDApp.addShape("kubus");
        // twoDApp.drawShape("kubus");

        GenericClass<String> gn = new GenericClass<String>();

        gn.addData("Hellow");
        gn.showData();
    }

    public static void main( String[] args )
    {
        new App();
    }
}
