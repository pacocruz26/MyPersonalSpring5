package guru.springframework.sfgid.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgid.services.ConstructorInjectedGreetingService;

public class PropertyInjectedControllerTest {
	
	 PropertyInjectedController controller;
	 
	 @BeforeEach
	 void setUp() {
		 System.out.println("PropertyInjectedControllerTest - setUp");
		 controller = new PropertyInjectedController();
		 controller.greetingService = new ConstructorInjectedGreetingService();
		 
	 }

	 @Test
	 void getGreetings() {
		 System.out.println("PropertyInjectedControllerTest - getGreetings");
		 System.out.println(controller.getGrettings());
	 }
}
