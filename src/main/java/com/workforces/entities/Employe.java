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

}
