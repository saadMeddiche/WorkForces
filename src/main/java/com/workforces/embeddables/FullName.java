package com.workforces.embeddables;

import jakarta.persistence.Embeddable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Embeddable
public class FullName {

    @NotEmpty(message = "Please enter your First Name")
    @NotNull(message = "Please enter your First Name")
    @Pattern(regexp = "^[^\\s]*$", message = "No Space Allowed")
    private String firstName;

    @Pattern(regexp = "^[^\\s]*$", message = "No Space Allowed")
    private String middleName;

    @NotEmpty(message = "Please enter your Last Name")
    @NotNull(message = "Please enter your Last Name")
    @Pattern(regexp = "^[^\\s]*$", message = "No Space Allowed")
    private String lastName;

    public FullName() {
    }

    public FullName(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
