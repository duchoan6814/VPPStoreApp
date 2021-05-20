package com.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@Transactional
@EnableWebMvc
public class MainController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

}
