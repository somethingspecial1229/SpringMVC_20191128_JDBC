package com.web.mvc.controller;

import com.web.mvc.repository.spec.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/micro_market")
public class MicroMarketController {

    @Autowired
    @Qualifier("customerDao")
    CustomerDao dao;

    @RequestMapping("/input")
    public String input(Model model) {
        model.addAttribute("list", dao.queryMicroMarket());
        return "micro_market";
    }

}
