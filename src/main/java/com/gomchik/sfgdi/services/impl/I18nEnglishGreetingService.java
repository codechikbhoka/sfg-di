package com.gomchik.sfgdi.services.impl;

import com.gomchik.sfgdi.services.interfaces.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author vbbharga on 11/04/20
 */
@Profile("EN")
@Service("i18nGreetingService")
public class I18nEnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello world By I18nGreetingService - EN\n";
    }
}
