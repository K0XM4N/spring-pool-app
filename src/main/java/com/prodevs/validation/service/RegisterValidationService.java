package com.prodevs.validation.service;

import com.prodevs.validation.form.EmployeeForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Validator;
import javax.validation.ConstraintViolation;
import java.util.Set;


/**
 * Created by Krzysztof on 2017-06-18.
 */
@Service
public class RegisterValidationService {

    @Autowired
    private Validator validator;

    public RegisterValidationService(Validator validator) {
        this.validator = validator;
    }

    public boolean verifyRegistrationFrom(EmployeeForm employeeForm){
        Set<ConstraintViolation<EmployeeForm>> errors = validator.validate(employeeForm);
        if (errors.isEmpty()){
            return true;
        }
        else{
            errors.forEach(errorMessage -> System.out.println(errorMessage.getMessage()));
            return false;
        }
    }
}
