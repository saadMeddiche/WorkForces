package com.workforces.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employe {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
