package com.prodevs.controller;

import com.prodevs.factory.impl.EmployeeFactoryImpl;
import com.prodevs.model.Employee;
import com.prodevs.service.EmployeeService;
import com.prodevs.validation.form.EmployeeForm;
import com.prodevs.validation.service.RegisterValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

/**
 * Created by Krzysztof on 2017-05-12.
 */
@Controller
public class ViewController {

    @Autowired
    private RegisterValidationService registerValidationService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private EmployeeFactoryImpl employeeFactory;


    public ViewController(RegisterValidationService registerValidationService){
        this.registerValidationService = registerValidationService;
    }

    @GetMapping(value = "/")
    public String displayWelcomePage(){

        return "welcome-thymeleaf";

    }

    @GetMapping(value = "/register")
    public String displayRegisterPage(EmployeeForm employeeForm, Model model){

        model.addAttribute("employeeBean", new Employee());
        return "register-page";

    }

    @PostMapping(value = "/register")
    public String registerEmployee(@Valid EmployeeForm employeeForm, BindingResult bindingResult){

        registerValidationService.setEmployeeForm(employeeForm);
        registerValidationService.setBindingResult(bindingResult);

        if (registerValidationService.isRegistrationFormValid()){

            employeeService.save(employeeFactory.createEmployee(employeeForm));
            return "redirect:/";
        }
        else{
            return "register-page";
        }

    }

    @GetMapping(value = "/login")
    public String displayLoginPage(Model model){
        return "login-page";
    }

}
