package com.prodevs.validation.validator;

import com.prodevs.validation.annotation.Dropdown;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by Krzysztof on 2017-08-11.
 */
public class DropdownValidator implements ConstraintValidator<Dropdown, String>{
    @Override
    public void initialize(Dropdown dropdown) {

    }

    @Override
    public boolean isValid(String dropdownValue, ConstraintValidatorContext constraintValidatorContext) {

        if (dropdownValue.contains("Default")){
            return false;
        }

        return true;
    }
}
