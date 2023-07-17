package com.dommy.bank.api.customer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    String index(){
        return "This is Customer API";
    }
}
