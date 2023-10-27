package com.workforces.services.implementations;

import com.workforces.entities.Department;
import com.workforces.entities.Employe;
import java.util.Objects;

public class EmployeService {

    Employe employe;

    Department department;

    EmployeService(Employe employe, Department department) {
        this.employe = employe;
        this.department = department;
    }

    public void addEmploye(Employe Employe) {

    }

    public void updateEmploye(Employe Employe) {

    }

    public Employe getEmploye() {
        return this.employe;
    }

    public Department getDepartment() {
        return this.department;
    }

    @Override
    public String toString() {
        return "{" +
                " employe='" + getEmploye().getFullName().getFirstName() + "'" +
                ", department='" + getDepartment().getDescription() + "'" +
                "}";
    }

}
