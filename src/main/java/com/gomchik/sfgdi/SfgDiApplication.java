package com.gomchik.sfgdi;

import com.gomchik.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);


		System.out.println("-------- Injection by directly setting property in PropertyInjectedController");
		PropertyInjectedController piController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(piController.greet());

		System.out.println("-------- Injection using setter in SetterInjectedController");
		SetterInjectedController siController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(siController.greet());

		System.out.println("-------- Injection using constructor in ConstructorInjectedController");
		ConstructorInjectedController ciController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(ciController.greet());


		System.out.println("-------- I18nGreetingService");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.greet());
	}

}
