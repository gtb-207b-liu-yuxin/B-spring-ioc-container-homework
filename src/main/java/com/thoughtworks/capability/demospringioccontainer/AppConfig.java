package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.function.Function;

@Configuration
public class AppConfig {
    @Bean
    public Function<String, GreetingService> beanFactory() {
        return name -> prototypeBeanWithParam();
    }

    @Bean
    @Scope(value = "prototype")
    public GreetingService prototypeBeanWithParam() {
        return new GreetingService();
    }
}
