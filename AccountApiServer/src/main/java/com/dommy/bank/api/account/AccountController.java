package com.dommy.bank.api.account;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    String index(){
        return "This is Account API";
    }
}
