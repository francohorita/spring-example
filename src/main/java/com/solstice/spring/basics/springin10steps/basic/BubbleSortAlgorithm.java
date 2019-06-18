package com.solstice.spring.basics.springin10steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm{

    public int[] sort(int[] numbers){

        //Sort logic

        return numbers;

    }

}