package com.yuxiu.edu.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("salary")
public class SalaryController {

    @RequestMapping("manage")
    public String manage(){
        return "Salary/Manage";

    }
    @RequestMapping("manage2")
    public String manage2(){
        return "Salary/Manage2";

    }
}

