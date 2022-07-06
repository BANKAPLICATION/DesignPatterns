package com.company.behavioral.Strategy;

import java.util.Arrays;

public class SelectionSort implements Sorting {

    @Override
    public void sort(int[] arr) {
        System.out.println("Insertion sort");
        System.out.println("Before " + Arrays.toString(arr));
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            for (int i = barrier + 1; i < arr.length - 1; i++) {
                if(arr[i] < arr[barrier]) {
                    int tmp = arr[i];
                    arr[i] = arr[barrier];
                    arr[barrier] = tmp;
                }
            } 
        }
        System.out.println("After " + Arrays.toString(arr));
    }
}
