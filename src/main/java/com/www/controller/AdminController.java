package com.www.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping(value = {"", "/", "/dashboard"})
    public String getDashboard() {
        return "admin/index";
    }

    @GetMapping("/product")
    public String getProduct() {
        return "admin/product";
    }

}