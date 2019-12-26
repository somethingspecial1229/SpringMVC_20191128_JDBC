package com.web.mvc.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/micro_market")
public class MicroMarketController {
    
    @RequestMapping("/input")
    public String input(Model model) {
        return "micro_market";
    }
    
}