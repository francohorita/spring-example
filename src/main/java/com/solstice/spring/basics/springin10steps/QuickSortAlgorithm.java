package com.solstice.spring.basics.springin10steps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Primary -- Primary notation overrides the Autowire by name.
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {

    public int[] sort(int[] numbers){

        //Sort logic

        return numbers;

    }

}