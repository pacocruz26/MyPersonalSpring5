package guru.springframework.sfgid.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgid.services.GreetingService;

@Controller
public class PropertyInjectedController {
	@Autowired
	public GreetingService greetingService;
	
	public String getGrettings(){
		 System.out.println("PropertyInjectedController - getGrettings");
		return greetingService.sayGreetings();
		
	}

}
