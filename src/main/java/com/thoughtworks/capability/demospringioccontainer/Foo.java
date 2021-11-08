package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Foo implements ApplicationContextAware, InitializingBean {

    private Bar bar;
    private ApplicationContext context;

    public Bar getBar() {
        return bar;
    }

    public void hi() {
        System.out.println("Hi, " + bar.name());
    }

    public String name() {
        return "Foo";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        bar = context.getBean(Bar.class);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }
}
