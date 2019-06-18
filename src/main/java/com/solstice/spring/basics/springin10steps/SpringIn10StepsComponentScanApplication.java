package com.solstice.spring.basics.springin10steps;

import com.solstice.spring.basics.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.solstice.spring.basics.componentscan")
public class SpringIn10StepsComponentScanApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn10StepsComponentScanApplication.class);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =	new AnnotationConfigApplicationContext(SpringIn10StepsComponentScanApplication.class);

        ComponentDAO componentDao = applicationContext.getBean(ComponentDAO.class);

        LOGGER.info("{}", componentDao);

        applicationContext.close();
    }

}
