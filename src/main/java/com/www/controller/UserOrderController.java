package com.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/order")
public class UserOrderController {
    @RequestMapping(value = {"/", "/all", ""})
    public String getOrderAll() {
        return "/user/order-all";
    }

}
