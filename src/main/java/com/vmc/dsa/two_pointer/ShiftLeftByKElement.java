package com.vmc.dsa.two_pointer;

import java.util.Arrays;

public class ShiftLeftByKElement {

    public static void main(String[] args) {
        char[] arr= {'\u0000','\u0000','\u0000','\u0000','a','b','c','d','e','f'};
        System.out.println(Arrays.toString(arr));
        // hear my sub array is a,b,c so size is  3 shift left
        int low=4,high=7,gap=2;
        shiftLeft(arr,low,high,gap);
        System.out.println(Arrays.toString(arr));
    }

    private static void shiftLeft(char [] arr,int low, int high,int gap) {

        for (int i=low;i<high;i++){
            arr[i-gap]=arr[i];
        }


    }
}
