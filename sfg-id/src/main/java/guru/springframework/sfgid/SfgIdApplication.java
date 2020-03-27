package guru.springframework.sfgid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.sfgid.controllers.MyController;

@SpringBootApplication
public class SfgIdApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgIdApplication.class, args);
		MyController myController = (MyController)ctx.getBean("myController");
		String greetings = myController.sayHello();
		System.out.println(">> " +greetings);
	}

}
