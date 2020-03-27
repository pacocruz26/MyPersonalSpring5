package guru.springframework.sfgid.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgid.services.GreetingService;

@Controller
public class ConstructorInjectedController {
	
	public final GreetingService greetingService;

	public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingService") GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String getGrettings(){
		 System.out.println("ConstructorInjectedController - getGrettings");
		return greetingService.sayGreetings();
		
	}

}
