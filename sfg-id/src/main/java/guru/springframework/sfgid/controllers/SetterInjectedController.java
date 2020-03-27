package guru.springframework.sfgid.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgid.services.GreetingService;

@Controller
public class SetterInjectedController {
	@Autowired
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
