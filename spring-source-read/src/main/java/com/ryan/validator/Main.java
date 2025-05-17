package com.ryan.validator;

import org.springframework.validation.MapBindingResult;
import org.springframework.validation.ValidationUtils;

import java.util.HashMap;

/**
 * @author Ryan Yuan
 * 2024-11-11 16:48
 **/
public class Main {

    public static void main(String[] args) {
        Person ryan = new Person("Ryan", 11);
        MapBindingResult person = new MapBindingResult(new HashMap<>(), "ryan");
        ValidationUtils.invokeValidator(new PersonValidator(), ryan, person);
        person.getAllErrors().forEach(System.out::println);
    }

}
