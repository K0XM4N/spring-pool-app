package com.prodevs.factory.impl;

import com.prodevs.factory.interfaces.EmployeeFactoryInterface;
import com.prodevs.model.Employee;
import com.prodevs.security.service.PasswordEncryptor;
import com.prodevs.validation.form.EmployeeForm;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.time.LocalDate;

/**
 * Created by Krzysztof on 2017-08-12.
 */
@Component
public class EmployeFactoryImpl implements EmployeeFactoryInterface {

    @Override
    public Employee createEmployee(EmployeeForm employeeForm) {

        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeForm, employee);
        employee.setPhone(Integer.parseInt(employeeForm.getPhone()));
        employee.setPassword(PasswordEncryptor.hashPassword(employeeForm.getPassword()));
        employee.setUpdatedAt(Date.valueOf(LocalDate.now()));

        if (employeeForm.getIsActive().equals("Active")){
            employee.setActive(true);
        }
        else{
            employee.setActive(false);
        }

        System.out.println(employee.toString());

        return employee;
    }
}
