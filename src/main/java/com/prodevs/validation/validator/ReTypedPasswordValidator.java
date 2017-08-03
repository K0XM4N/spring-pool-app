package com.prodevs.validation.validator;

import com.prodevs.validation.annotation.ReTypedPassword;
import com.prodevs.validation.form.EmployeeForm;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by Krzysztof on 2017-08-03.
 */
@Component
public class ReTypedPasswordValidator implements ConstraintValidator<ReTypedPassword, String> {

    private EmployeeForm employeeForm;

    @Override
    public void initialize(ReTypedPassword reTypedPassword) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        if (employeeForm.getPassword().equals(employeeForm.getRePassword())){
            return true;
        }

        return false;
    }


    public void setEmployeeForm(EmployeeForm employeeForm) {
        this.employeeForm = employeeForm;
    }
}
