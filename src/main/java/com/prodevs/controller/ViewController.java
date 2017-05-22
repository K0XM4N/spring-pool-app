package com.prodevs.controller;

import com.prodevs.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Krzysztof on 2017-05-12.
 */
@Controller
public class ViewController {

    @GetMapping(value = "/")
    public String displayWelcomePage(){

        return "welcome-thymeleaf";

    }

    @GetMapping(value = "/register")
    public String displayRegisterPage(Model model){

        model.addAttribute("employeeBean", new Employee());
        return "register-page";

    }

}
