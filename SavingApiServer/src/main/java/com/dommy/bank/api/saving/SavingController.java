package com.dommy.bank.api.saving;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SavingController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    String index(){
        return "This is Saving API";
    }
}
