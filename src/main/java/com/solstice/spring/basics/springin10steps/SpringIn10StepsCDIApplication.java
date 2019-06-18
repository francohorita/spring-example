package com.solstice.spring.basics.springin10steps;

import com.solstice.spring.basics.springin10steps.cdi.SomeCDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan //Adding @ComponentScan since SpringBoot added it by default previously. No args since by default choose current package.
public class SpringIn10StepsCDIApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn10StepsCDIApplication.class);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =	new AnnotationConfigApplicationContext(SpringIn10StepsCDIApplication.class);

        SomeCDIBusiness someCDIBusiness = applicationContext.getBean(SomeCDIBusiness.class);

        LOGGER.info("{}, dao-{}", someCDIBusiness, someCDIBusiness.getSomeCDIDAO());

        applicationContext.close();
    }

}
