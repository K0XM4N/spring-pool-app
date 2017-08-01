package com.prodevs.validation;

import com.prodevs.validation.annotation.Password;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

/**
 * Created by Krzysztof on 2017-08-01.
 */
public class PasswordValidator implements ConstraintValidator<Password, String> {
    @Override
    public void initialize(Password password) {

    }

    @Override
    public boolean isValid(String password, ConstraintValidatorContext constraintValidatorContext) {

        String minLength = "8";
        String maxLength = "20";

        if (Pattern.matches("\\w{" + minLength + "," + maxLength + "}",password)){
            return true;
        }

        return false;
    }
}
