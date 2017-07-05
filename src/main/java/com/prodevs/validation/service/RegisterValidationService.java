package com.prodevs.validation.service;

import com.prodevs.validation.form.EmployeeForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

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
    private BindingResult bindingResult;
    private EmployeeForm employeeForm;

    public RegisterValidationService(Validator validator) {
        this.validator = validator;
    }

    public boolean isRegistrationFormValid(){
        Set<ConstraintViolation<EmployeeForm>> errors = validator.validate(employeeForm);

        if (errors.isEmpty() && !bindingResult.hasErrors()){
            return true;
        }
        else{
            errors.forEach(errorMessage -> System.out.println(errorMessage.getMessage()));
            return false;
        }

    }

    public void setBindingResult(BindingResult bindingResult) {
        this.bindingResult = bindingResult;
    }

    public BindingResult getBindingResult() {
        return bindingResult;
    }

    public void setEmployeeForm(EmployeeForm employeeForm) {
        this.employeeForm = employeeForm;
    }
}
