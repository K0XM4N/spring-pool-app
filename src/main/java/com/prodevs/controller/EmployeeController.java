package com.prodevs.controller;

import com.prodevs.model.Employee;
import com.prodevs.service.EmployeeService;
import com.prodevs.validation.form.EmployeeForm;
import com.prodevs.validation.service.RegisterValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.Date;
import java.time.LocalDateTime;

/**
 * Created by Krzysztof on 2017-05-21.
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private RegisterValidationService registerValidationService;

    public EmployeeController(EmployeeService employeeService, RegisterValidationService registerValidationService) {
        this.employeeService = employeeService;
        this.registerValidationService = registerValidationService;
    }

    @GetMapping("/test")
    public String addEmployee(){

//        Employee employee = new Employee("Janusz","Chuj","asda@o2.pl",111222333,"kutas123","pedalpass",false, LocalDateTime.now(),"admin");
//        employeeService.save(employee);
//        System.out.println("saved employee");

        return "welcome-page";
    }



}
