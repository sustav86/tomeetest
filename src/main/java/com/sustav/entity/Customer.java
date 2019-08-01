package com.sustav.entity;

import java.time.LocalDate;

@ChronologicalDates
public class Customer {
    private LocalDate birthDate;
    private LocalDate deathDate;

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(LocalDate deathDate) {
        this.deathDate = deathDate;
    }
}
