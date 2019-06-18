package com.solstice.spring.basics.springin10steps.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //@PreDestroy works if the bean is Singleton
public class BinarySearchImpl {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("bubble")
    private SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int numberToSearch){

        System.out.println(sortAlgorithm);

        int[] sortedNumbers = sortAlgorithm.sort(numbers);

        return 3;

    }

    @PostConstruct
    private void postConstruct(){
        logger.info("postConstruct");
    }

    @PreDestroy
    private void preDestroy(){
        logger.info("preDestroy");
    }

}
