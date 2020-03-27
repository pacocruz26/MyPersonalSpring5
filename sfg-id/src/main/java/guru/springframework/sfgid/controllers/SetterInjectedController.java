package guru.springframework.sfgid.controllers;

import guru.springframework.sfgid.services.GreetingService;

public class SetterInjectedController {
	private GreetingService greetingService;
	
	public void setGreetingService(GreetingService greetingService) {
		System.out.println("SetterInjectedController - getGrettings");
		this.greetingService = greetingService;
	}

	public String getGrettings(){
		 System.out.println("SetterInjectedController - getGrettings");
		return greetingService.sayGreetings();
		
	}
}
