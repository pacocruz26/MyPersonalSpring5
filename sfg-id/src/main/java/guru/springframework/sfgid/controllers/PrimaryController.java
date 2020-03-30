package guru.springframework.sfgid.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.sfgid.services.GreetingService;

@Controller
public class PrimaryController {
	private GreetingService greetingService;

	public PrimaryController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String sayHello(){
		return greetingService.sayGreetings();
	}
	

}
