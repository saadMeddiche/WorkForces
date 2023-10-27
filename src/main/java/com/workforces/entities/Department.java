package com.workforces.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Please enter name of department")
    @NotNull(message = "Please enter name of department")
    @Pattern(regexp = "^[^\\s]*$", message = "No Space Allowed in the name of department")
    private String name;

    @NotEmpty(message = "Please enter description of department")
    private String description;

}
