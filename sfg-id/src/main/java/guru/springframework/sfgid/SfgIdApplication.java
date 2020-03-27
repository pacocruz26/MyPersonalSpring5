package guru.springframework.sfgid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.sfgid.controllers.ConstructorInjectedController;
import guru.springframework.sfgid.controllers.MyController;
import guru.springframework.sfgid.controllers.PropertyInjectedController;
import guru.springframework.sfgid.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgIdApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgIdApplication.class, args);
		MyController myController = (MyController)ctx.getBean("myController");
		String greetings = myController.sayHello();
		System.out.println(">> " +greetings);
		
		System.out.println("------------------PropertyInjectedController");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGrettings());
		
		System.out.println("-------------------SetterInjectedController");
		SetterInjectedController setterInjectedController = (SetterInjectedController)ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGrettings());
		
		System.out.println("-------------------ConstructorInjectedController");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGrettings());
		
	}

}
