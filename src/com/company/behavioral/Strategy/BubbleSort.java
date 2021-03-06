package com.company.behavioral.Strategy;

import java.util.Arrays;

public class BubbleSort implements Sorting {

    @Override
    public void sort(int[] arr) {
        System.out.println("Bubble sort");
        System.out.println("Before " + Arrays.toString(arr));
        for (int barrier = arr.length - 1; barrier >= 0 ; barrier--) {
            for (int i = 0; i < barrier; i++) {
                if(arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
        }
        System.out.println("After "  + Arrays.toString(arr));
    }
}
