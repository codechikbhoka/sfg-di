package com.gomchik.sfgdi.controllers;

import com.gomchik.sfgdi.services.interfaces.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author vbbharga on 11/04/20
 */
@Controller
public class I18nController {

    private final GreetingService greetingService;

    public I18nController(@Qualifier("i18nGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greet(){
        return greetingService.sayGreeting();
    }
}
