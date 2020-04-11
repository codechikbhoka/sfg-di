package com.gomchik.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author vbbharga on 11/04/20
 */
@Controller
public class MyController {

    public String sayHello() {
        return "\nHi! from MyController\n";
    }
}
