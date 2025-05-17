package com.ryan.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * @author Ryan Yuan
 * 2024-11-11 16:48
 **/
public class PersonValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Person p = (Person) target;
        if (p.getAge() < 0) {
            errors.rejectValue("age", "negative value");
        } else if (p.getAge() > 110) {
            errors.rejectValue("age", "too.darn.old");
        }
    }

}
