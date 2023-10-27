package com.workforces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workforces.entities.Department;
import com.workforces.entities.Employe;
import com.workforces.services.implementations.EmployeService;

public class App {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        Employe employe = applicationContext.getBean("employe", Employe.class);
        employe.test();
        System.out.println(employe.getFullName().getFirstName());

        Department department = applicationContext.getBean("department", Department.class);
        department.test();
        System.out.println(department.getDescription());

        EmployeService employeService = applicationContext.getBean("employeService", EmployeService.class);
        System.out.println(employeService.toString());

    }
}
