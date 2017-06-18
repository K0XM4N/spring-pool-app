package com.prodevs.validation;

import com.prodevs.validation.annotation.Phone;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by Krzysztof on 2017-06-18.
 */
public class PhoneValidator implements ConstraintValidator<Phone, String> {
    @Override
    public void initialize(Phone phone) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        Regex regex = new Regex("^(?:[0+]48)?\\d{9}$");
        if (s.matches(String.valueOf(regex))){
            return true;
        }
        else{
            return false;
        }

    }

}
