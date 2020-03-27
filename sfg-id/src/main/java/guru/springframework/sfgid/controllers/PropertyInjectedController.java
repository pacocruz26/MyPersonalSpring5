package guru.springframework.sfgid.controllers;

import guru.springframework.sfgid.services.GreetingService;

public class PropertyInjectedController {
	public GreetingService greetingService;
	
	public String getGrettings(){
		 System.out.println("PropertyInjectedController - getGrettings");
		return greetingService.sayGreetings();
		
	}

}
