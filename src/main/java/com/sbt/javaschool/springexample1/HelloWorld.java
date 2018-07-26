package com.sbt.javaschool.springexample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld helloWorld = context.getBean(HelloWorld.class);

        BeanCDL beanCDL = context.getBean(BeanCDL.class);
        System.out.println(beanCDL.getMessage().getMessageText());
    }


}
