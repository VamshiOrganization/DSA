package com.vmc.dsa.two_pointer;

import java.util.Arrays;

public class ShiftRightByKElement {

    public static void main(String[] args) {
        char[] arr= {'a','b','c','d','e','f','\u0000','\u0000','\u0000','\u0000'};
        System.out.println(Arrays.toString(arr));
        // hear my sub array is a,b,c so size is  3 shift left
        int low=0,high=5,gap=4;
        shiftLeft(arr,low,high,gap);
        System.out.println(Arrays.toString(arr));
    }

    private static void shiftLeft(char [] arr,int low, int high,int gap) {

        for (int i=high;i>=low;i--){
            arr[i+gap]=arr[i];
        }


    }
}
