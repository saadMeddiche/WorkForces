package com.workforces.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Please enter name of department")
    @NotNull(message = "Please enter name of department")
    @Pattern(regexp = "^[^\\s]*$", message = "No Space Allowed in the name of department")
    private String name;

    @NotEmpty(message = "Please enter description of department")
    @NotNull(message = "Please enter name of department")
    private String description;

    public Department() {
    }

    public Department(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void test() {
        System.out.println("Hi Am an Department");
    }

}
