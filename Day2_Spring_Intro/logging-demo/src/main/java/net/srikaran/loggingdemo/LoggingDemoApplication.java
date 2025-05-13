package net.srikaran.loggingdemo;


import net.srikaran.loggingdemo.component.DemoBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LoggingDemoApplication {

    public static final Logger logger = LoggerFactory.getLogger(LoggingDemoApplication.class);

    public static void main(String[] args) {
        logger.debug("Welcome to Spring Concept Demo");

        ApplicationContext context = SpringApplication.run(LoggingDemoApplication.class, args);

        logger.debug("Checking Context: {}", context.getBean(DemoBean.class));
        logger.debug("**** Example Using @Autowired annotation on property ****");
    }
}

