package guru.springframework.sfgid.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedrGreetingService implements GreetingService{
	
	public String sayGreetings() {
		return "Hello World - Setter";
	}
}
