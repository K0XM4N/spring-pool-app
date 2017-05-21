package com.prodevs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Krzysztof on 2017-05-12.
 */
@Controller
public class ViewController {

    @GetMapping(value = "/")
    public String displayWelcomePage(){

        return "login-page";

    }

    @GetMapping(value = "/register")
    public String displayRegisterPage(){

        return "register-page";

    }

}
