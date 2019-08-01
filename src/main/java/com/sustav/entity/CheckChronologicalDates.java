package com.sustav.entity;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckChronologicalDates implements ConstraintValidator<ChronologicalDates, Customer> {
    @Override
    public boolean isValid(Customer value, ConstraintValidatorContext context) {
        return value.getBirthDate().isBefore(value.getDeathDate());
    }
}
