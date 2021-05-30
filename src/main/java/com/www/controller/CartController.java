package com.www.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cart")
public class CartController {

    @RequestMapping(value = {"", "/"})
    public String getCart() {
        return "cart";
    }

    @PostMapping(value = {"/add"})
    public void postAddCart(HttpRequest request) {
    }

}
