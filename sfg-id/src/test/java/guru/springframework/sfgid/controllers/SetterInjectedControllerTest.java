package guru.springframework.sfgid.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgid.services.ConstructorInjectedGreetingService;

public class SetterInjectedControllerTest {
	
	 SetterInjectedController controller;
	 
	 @BeforeEach
	 void setUp() {
		 System.out.println("SetterInjectedControllerTest - setUp");
		 controller = new SetterInjectedController();
		 controller.setGreetingService(new ConstructorInjectedGreetingService()); 
		 
	 }

	 @Test
	 void getGreetings() {
		 System.out.println("SetterInjectedControllerTest - getGreetings");
		 System.out.println(controller.getGrettings());
	 }
}
