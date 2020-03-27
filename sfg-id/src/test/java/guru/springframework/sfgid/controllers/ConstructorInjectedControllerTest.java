package guru.springframework.sfgid.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgid.services.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {
	
	 ConstructorInjectedController controller;
	 
	 @BeforeEach
	 void setUp() {
		 System.out.println("ConstructorInjectedControllerTest - setUp");
		 controller = new ConstructorInjectedController(new GreetingServiceImpl());
	 }

	 @Test
	 void getGreetings() {
		 System.out.println("ConstructorInjectedControllerTest - getGreetings");
		 System.out.println(controller.getGrettings());
	 }
}
