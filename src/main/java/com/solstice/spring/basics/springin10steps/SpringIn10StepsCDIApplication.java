package com.solstice.spring.basics.springin10steps;

import com.solstice.spring.basics.springin10steps.cdi.SomeCDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn10StepsCDIApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn10StepsCDIApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn10StepsBasicApplication.class, args);

        SomeCDIBusiness someCDIBusiness = applicationContext.getBean(SomeCDIBusiness.class);

        LOGGER.info("{}, dao-{}", someCDIBusiness, someCDIBusiness.getSomeCDIDAO());

    }

}
