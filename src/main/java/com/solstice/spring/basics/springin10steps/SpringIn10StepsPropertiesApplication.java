package com.solstice.spring.basics.springin10steps;

import com.solstice.spring.basics.springin10steps.basic.BinarySearchImpl;
import com.solstice.spring.basics.springin10steps.properties.SomeExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan //Adding @ComponentScan since SpringBoot added it by default previously. No args since by default choose current package.
@PropertySource("classpath:app.properties")
public class SpringIn10StepsPropertiesApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext =	new AnnotationConfigApplicationContext(SpringIn10StepsPropertiesApplication.class);

		SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);
		System.out.println(someExternalService.returnUrl());

	}

}
