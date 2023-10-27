package com.workforces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workforces.entities.Department;
import com.workforces.entities.Employe;

public class App {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        Employe employe = applicationContext.getBean("employe", Employe.class);
        employe.test();

        Department department = applicationContext.getBean("department", Department.class);
        department.test();

        Employe employe2 = new Employe();
        employe2.test();
    }
}
