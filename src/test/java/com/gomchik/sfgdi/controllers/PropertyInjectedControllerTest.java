package com.gomchik.sfgdi.controllers;

import com.gomchik.sfgdi.services.impl.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author vbbharga on 11/04/20
 */
class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

   @BeforeEach
   void setUp() {
       controller = new PropertyInjectedController();

       controller.greetingService = new ConstructorGreetingService();
   }

    @Test
    void getGreeting() {

        System.out.println(controller.greet());
    }
}