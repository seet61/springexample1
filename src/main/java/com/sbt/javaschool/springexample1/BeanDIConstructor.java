package com.sbt.javaschool.springexample1;

import org.springframework.stereotype.Component;

@Component
public class BeanDIConstructor {
    Message message;

    public BeanDIConstructor(Message message) {
        this.message = message;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
