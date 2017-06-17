package com.prodevs.validation;

import com.prodevs.validation.annotation.Phone;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by Krzysztof on 2017-06-18.
 */
public class PhoneValidator implements ConstraintValidator<Phone, Integer> {
    @Override
    public void initialize(Phone phone) {

    }

    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        return false;
    }
}
