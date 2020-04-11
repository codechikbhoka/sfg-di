package com.gomchik.sfgdi.services.impl;

import com.gomchik.sfgdi.services.interfaces.GreetingService;
import org.springframework.stereotype.Service;

/**
 * @author vbbharga on 11/04/20
 */
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world By ConstructorGreetingService\n";
    }

}
