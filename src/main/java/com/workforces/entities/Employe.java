package com.workforces.entities;

import com.workforces.embeddables.FullName;
import com.workforces.embeddables.Salery;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.Valid;

@Entity
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    @Valid
    private FullName fullName;

    @Embedded
    @Valid
    private Salery salery;

    @OneToMany
    @Valid
    private Department department;

    public Employe() {
    }

    public Employe(Long id, FullName fullName, Salery salery, Department department) {
        this.id = id;
        this.fullName = fullName;
        this.salery = salery;
        this.department = department;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FullName getFullName() {
        return this.fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public Salery getSalery() {
        return this.salery;
    }

    public void setSalery(Salery salery) {
        this.salery = salery;
    }

    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

}
