package com.pluralsight.conferenceMVC.model;


import javax.validation.constraints.NotEmpty;

public class Registration {
    // use the validator dependency to validate input
    // via the annotation @NotEmpty
    @NotEmpty
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
