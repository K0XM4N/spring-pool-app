package com.prodevs.controller;

import com.prodevs.model.Employee;
import com.prodevs.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by Krzysztof on 2017-05-21.
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService service){
        this.employeeService = service;
    }

    @PostMapping(value = "/register")
    public String registerEmployee(@ModelAttribute Employee registeredEmployee, Model model){

        employeeService.save(registeredEmployee);
        return "register-page";

    }

}
