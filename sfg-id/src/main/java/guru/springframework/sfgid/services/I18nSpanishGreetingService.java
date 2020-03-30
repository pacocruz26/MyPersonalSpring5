package guru.springframework.sfgid.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("SP")
@Service("I18nService")
public class I18nSpanishGreetingService implements GreetingService
{
	
	@Override
	public String sayGreetings() {
		// TODO Auto-generated method stub
		return "Hola Mundo - SP";
	}

}
