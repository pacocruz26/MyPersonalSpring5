package guru.springframework.sfgid.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGrettingService implements GreetingService{

	@Override
	public String sayGreetings() {
		return "Hello world from PrimaryGrettingService";
	}

}
