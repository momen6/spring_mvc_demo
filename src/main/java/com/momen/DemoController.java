package com.momen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

    @RequestMapping("/form")
    public String showEmployeePage(){
        return "helloWorldForm";
    }

    @RequestMapping("/")
    public String showPage(){
        return "welcome";
    }

    @RequestMapping("processForm")
    public String processForm(){
        return "processForm";
    }
}
