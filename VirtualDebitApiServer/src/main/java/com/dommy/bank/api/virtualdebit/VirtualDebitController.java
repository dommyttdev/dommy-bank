package com.dommy.bank.api.virtualdebit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VirtualDebitController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    String index(){
        return "This is Virtual Debit Card API";
    }
}
