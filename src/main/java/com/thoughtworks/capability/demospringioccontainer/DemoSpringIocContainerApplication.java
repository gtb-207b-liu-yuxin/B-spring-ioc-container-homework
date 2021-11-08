package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoSpringIocContainerApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(DemoSpringIocContainerApplication.class, args);
        GreetingController greetingController = applicationContext.getBean(GreetingController.class);
        System.out.println(greetingController);
        System.out.println(greetingController);
        greetingController.greet();
        greetingController.greet();
    }

}
