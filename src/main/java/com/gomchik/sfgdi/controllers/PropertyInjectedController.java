package com.gomchik.sfgdi.controllers;

import com.gomchik.sfgdi.services.interfaces.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author vbbharga on 11/04/20
 */
@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    public GreetingService greetingService;

    public String greet(){
        return greetingService.sayGreeting();
    }
}
