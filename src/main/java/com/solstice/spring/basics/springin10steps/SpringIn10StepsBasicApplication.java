package com.solstice.spring.basics.springin10steps;

import com.solstice.spring.basics.springin10steps.basic.BinarySearchImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan //Adding @ComponentScan since SpringBoot added it by default previously. No args since by default choose current package.
public class SpringIn10StepsBasicApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext =	new AnnotationConfigApplicationContext(SpringIn10StepsBasicApplication.class);

		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);

		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch1);

		int result = binarySearch.binarySearch(new int[] {12,4,3}, 3);
		System.out.println(result);

		applicationContext.close();
	}

}
