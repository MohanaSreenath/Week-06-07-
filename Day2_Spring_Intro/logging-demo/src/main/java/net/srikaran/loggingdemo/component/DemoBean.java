package net.srikaran.loggingdemo.component;

import org.springframework.stereotype.Component;

@Component
public class DemoBean {
    private String message = "Hello from DemoBean";

    public String getMessage() {
        return message;
    }
}

