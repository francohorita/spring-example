package com.solstice.spring.basics.springin10steps;

import com.solstice.spring.basics.componentscan.ComponentDAO;
import com.solstice.spring.basics.springin10steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.solstice.spring.basics.componentscan")
public class SpringIn10StepsComponentScanApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn10StepsComponentScanApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn10StepsBasicApplication.class, args);

        ComponentDAO componentDao = applicationContext.getBean(ComponentDAO.class);

        LOGGER.info("{}", componentDao);

    }

}
