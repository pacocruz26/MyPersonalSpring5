package guru.springframework.sfgid.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgid.services.GreetingService;

@Controller
public class I18nController  {
	
	private GreetingService greetingService;

	public I18nController(@Qualifier("I18nService") GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String sayHello(){
		return greetingService.sayGreetings();
	}

}
