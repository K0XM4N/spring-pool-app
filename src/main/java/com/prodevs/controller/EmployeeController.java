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



    @PostMapping(value = "/api/employees")
    public String registerEmployee(@Valid EmployeeForm employeeForm, BindingResult bindingResult){

        registerValidationService.setBindingResult(bindingResult);
        registerValidationService.setEmployeeForm(employeeForm);

        if (registerValidationService.verifyRegistrationFrom() == true){
            return "redirect:/";
        }
        else{
            return "redirect:/register";
        }

//        if (bindingResult.hasErrors()){
//            return "register-page";
//        }
//
//        return "welcome-page";

    }

    @GetMapping("/test")
    public String addEmployee(){

        Employee employee = new Employee("Janusz","Chuj","asda@o2.pl",111222333,"kutas123","pedalpass",false,new Date(100,10,10),"admin");
        employeeService.save(employee);
        System.out.println("saved employee");

        return "welcome-page";
    }



}
