package com.gomchik.sfgdi.controllers;

import com.gomchik.sfgdi.services.interfaces.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author vbbharga on 11/04/20
 */
@Controller
public class ConstructorInjectedController {

    public GreetingService greetingService;

    // @autowired is not required over constructor, starting from spring 4.2
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greet() {
        return greetingService.sayGreeting();
    }
}
