package com.prodevs.validation;

import com.prodevs.validation.annotation.Phone;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

/**
 * Created by Krzysztof on 2017-06-18.
 */
public class PhoneValidator implements ConstraintValidator<Phone, String> {
    @Override
    public void initialize(Phone phone) {

    }

    @Override
    public boolean isValid(String userInputPhoneNumber, ConstraintValidatorContext constraintValidatorContext) {

        boolean isNumberCorrectWithoutDasesh = Pattern.matches("[0-9]{9}",userInputPhoneNumber);
        boolean isNumberCorrectWithDashes  = false;

        if ((userInputPhoneNumber.charAt(3) == '-') && (userInputPhoneNumber.charAt(7) == '-') && (userInputPhoneNumber.length() == 11)){
            isNumberCorrectWithDashes = true;
        }

        if (isNumberCorrectWithDashes || isNumberCorrectWithoutDasesh ){
            return true;
        }
        else{
            return false;
        }

    }

}
