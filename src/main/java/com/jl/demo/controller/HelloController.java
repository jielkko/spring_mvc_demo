package com.jl.demo.controller;

import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/welcome")
public class HelloController {
	private static final String PREFIX_PATH = "hello/";
	
    @RequestMapping(value = "/ao",method = RequestMethod.GET)
    public String ao(ModelMap model) {
 
        model.addAttribute("message", "Spring3 MVC 例子");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        model.addAttribute("date", dateFormat.format(new java.util.Date()));
        return "hello";
    }
    
    @RequestMapping(value = "/to",method = RequestMethod.GET)
    public String to(ModelMap model) {
 
        model.addAttribute("message", "Spring3 MVC 例子");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        model.addAttribute("date", dateFormat.format(new java.util.Date()));
        return PREFIX_PATH+"to";
    }
    
}



