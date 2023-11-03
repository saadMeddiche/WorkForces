package com.workforces.services.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.workforces.entities.Department;
import com.workforces.entities.Employe;
import com.workforces.repositories.EmployeRepository;

@Service
public class EmployeService {

    Employe employe;

    Department department;

    
    private EmployeRepository employeRepository;

    @Autowired
    public EmployeService(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }

    public EmployeService(Employe employe, Department department) {
        this.employe = employe;
        this.department = department;
    }

    public Iterable<Employe> getAllEmployees() {
        return employeRepository.findAll();
    }

    public Optional<Employe> getEmployeeById(Long id) {
        return employeRepository.findById(id);
    }

    @Transactional
    public Employe updateEmployee(Employe employee) {
        return employeRepository.save(employee);
    }

    @Transactional
    public void deleteEmployee(Long id) {
        employeRepository.deleteById(id);
    }

    @Override
    public String toString() {
        return "{" +
                " employe='" + employe.getFullName().getFirstName() + "'" +
                ", department='" + department.getDescription() + "'" +
                "}";
    }

}
