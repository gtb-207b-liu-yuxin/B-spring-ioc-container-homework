package com.thoughtworks.capability.demospringioccontainer;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class GreetingController {

    private ObjectFactory<GreetingService> greetingService;

    @GetMapping("/greet")
    public String greet() {
        System.out.println(greetingService.getObject());
        return greetingService.getObject().sayHi();
    }

}
