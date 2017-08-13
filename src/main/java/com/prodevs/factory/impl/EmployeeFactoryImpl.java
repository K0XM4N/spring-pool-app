package com.prodevs.factory.impl;

import com.prodevs.factory.interfaces.EmployeeFactoryInterface;
import com.prodevs.model.Employee;
import com.prodevs.security.service.PasswordEncryptor;
import com.prodevs.validation.form.EmployeeForm;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by Krzysztof on 2017-08-12.
 */
@Component
public class EmployeeFactoryImpl implements EmployeeFactoryInterface {

    @Override
    public Employee createEmployee(EmployeeForm employeeForm) {

        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeForm, employee);
        employee.setPhone(Integer.parseInt(removeDashesFromPhoneNumber(employeeForm)));
        employee.setPassword(PasswordEncryptor.hashPassword(employeeForm.getPassword()));
        employee.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
        employee.setActive(checkAccountStatus(employeeForm));


        System.out.println(employee.toString());

        return employee;
    }


    private boolean checkAccountStatus(EmployeeForm employeeForm){

        if (employeeForm.getIsActive().equals("Active")){
            return true;
        }

        return false;

    }

    private String removeDashesFromPhoneNumber(EmployeeForm employeeForm){

        if (employeeForm.getPhone().contains("-")){
            return employeeForm.getPhone().replaceAll("-","");
        }

        return employeeForm.getPhone();
    }
}
