package com.solstice.spring.basics.springin10steps;

import com.solstice.spring.basics.springin10steps.basic.BinarySearchImpl;
import com.solstice.spring.basics.springin10steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn10StepsScopeApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn10StepsScopeApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn10StepsBasicApplication.class, args);

        PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
        PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

        LOGGER.info("{}", personDao);
        LOGGER.info("{}", personDao.getJdbcConnection());

        LOGGER.info("{}", personDao2);
        LOGGER.info("{}", personDao2.getJdbcConnection());

    }

}
