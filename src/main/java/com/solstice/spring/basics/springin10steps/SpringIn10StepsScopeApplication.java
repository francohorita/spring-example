package com.solstice.spring.basics.springin10steps;

import com.solstice.spring.basics.springin10steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan //Adding @ComponentScan since SpringBoot added it by default previously. No args since by default choose current package.
public class SpringIn10StepsScopeApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn10StepsScopeApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =	new AnnotationConfigApplicationContext(SpringIn10StepsScopeApplication.class);

        PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
        PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

        LOGGER.info("{}", personDao);
        LOGGER.info("{}", personDao.getJdbcConnection());

        LOGGER.info("{}", personDao2);
        LOGGER.info("{}", personDao2.getJdbcConnection());

    }

}
