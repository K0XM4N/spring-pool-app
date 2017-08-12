package com.prodevs.factory.interfaces;

import com.prodevs.model.Employee;
import com.prodevs.validation.form.EmployeeForm;

/**
 * Created by Krzysztof on 2017-08-12.
 */
public interface EmployeeFactoryInterface {
    public Employee createEmployee(EmployeeForm employeeForm);
}
