package com.upup.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public abstract class BaseController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

}
