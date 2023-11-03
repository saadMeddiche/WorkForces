package com.workforces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workforces.configurations.ConfigurationOfJpa;
import com.workforces.embeddables.FullName;
import com.workforces.embeddables.Salery;
import com.workforces.entities.Department;
import com.workforces.entities.Employe;
import com.workforces.services.implementations.EmployeService;

public class App {

    public static void main(String[] args) {

        System.out.println("========Dependencie Injection of Employe and Department in EmployeService========");
        dependencieInjectionOfEmployeAndDepartmentInEmployeService();

        System.out.println("========Get ALL Employies========");
        getAllEmployies();

        System.out.println("========Add New Employe========");
        Employe employe = addNewEmploye();

        System.out.println("========Update Employe========");
        updateEmployee(employe);

        System.out.println("========Delete Employe========");
        deleteEmploye(employe);
    }

    public static void dependencieInjectionOfEmployeAndDepartmentInEmployeService() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        Employe employe = applicationContext.getBean("employe", Employe.class);
        employe.test();
        System.out.println(employe.toString());

        Department department = applicationContext.getBean("department", Department.class);
        department.test();
        System.out.println(department.toString());

        EmployeService employeService = applicationContext.getBean("employeService",
                EmployeService.class);
        System.out.println(employeService.toString());

    }

    public static void getAllEmployies() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationOfJpa.class);

        EmployeService employeService = context.getBean(EmployeService.class);

        employeService.getAllEmployees().forEach(System.out::println);

        context.close();

    }

    public static Employe addNewEmploye() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationOfJpa.class);

        EmployeService employeService = context.getBean(EmployeService.class);

        Employe employe = new Employe();

        employe.setFullName(new FullName("Achour", null, "Meddiche"));
        employe.setSalery(new Salery(1000D, "MAD"));

        System.out.println(employe.toString());

        employeService.updateEmployee(employe);

        context.close();

        return employe;
    }

    public static void updateEmployee(Employe employe) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationOfJpa.class);

        EmployeService employeService = context.getBean(EmployeService.class);

        employe.getFullName().setFirstName("Achoure");

        System.out.println(employe.toString());

        employeService.updateEmployee(employe);

        context.close();
    }

    public static void deleteEmploye(Employe employe) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationOfJpa.class);

        EmployeService employeService = context.getBean(EmployeService.class);

        System.out.println(employe.toString());

        employeService.deleteEmployee(employe.getId());
    }

    public static void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        EmployeService employeService = applicationContext.getBean("employeServiceWithRepository",
                EmployeService.class);

        employeService.getAllEmployees().forEach(System.out::println);
    }
}
