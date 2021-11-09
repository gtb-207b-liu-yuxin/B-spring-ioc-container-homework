package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Function;

@RestController
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class GreetingController {
    @Autowired
    private Function<String, GreetingService> beanFactory;

    @GetMapping("/greet")
    public String greet() {
        System.out.println(beanFactory.apply("s"));
        return beanFactory.apply("s").sayHi();
    }

}
