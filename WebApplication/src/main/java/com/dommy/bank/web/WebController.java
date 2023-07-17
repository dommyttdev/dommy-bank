package com.dommy.bank.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    String index(){
        return "This is Web Application";
    }
}
