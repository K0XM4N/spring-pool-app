package com.prodevs.controller;

import com.prodevs.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

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
}
