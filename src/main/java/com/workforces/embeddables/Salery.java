package com.workforces.embeddables;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.PositiveOrZero;
import java.util.Objects;

@Embeddable
public class Salery {

    @PositiveOrZero
    @NotEmpty(message = "Please enter the value")
    @NotNull(message = "Please enter the value")
    private Double value;

    @NotEmpty(message = "Please enter then currency")
    @NotNull(message = "Please enter then currency")
    @Pattern(regexp = "^[^\\s]*$", message = "No Space Allowed")
    private String currency;

    public Salery() {
    }

    public Salery(Double value) {
        this.value = value;
        this.currency = "MAD";
    }

    public Salery(Double value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    public Double getValue() {
        return this.value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "{" +
                " value='" + getValue() + "'" +
                ", currency='" + getCurrency() + "'" +
                "}";
    }

}
