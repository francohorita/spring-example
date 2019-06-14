package com.solstice.spring.basics.springin10steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    @Qualifier("bubble")
    private SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int numberToSearch){

        System.out.println(sortAlgorithm);

        int[] sortedNumbers = sortAlgorithm.sort(numbers);

        return 3;

    }

}
