package com.workforces.embeddables;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.PositiveOrZero;

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

}
