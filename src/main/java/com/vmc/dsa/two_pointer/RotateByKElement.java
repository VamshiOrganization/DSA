package com.vmc.dsa.two_pointer;

import java.util.Arrays;


public class RotateByKElement {
    public static void main(String[] args) {
        char[] arr= {'a','b','c','d','e'};
        int k=2;
        rotate(arr,k);
        /* Algorithm
        int n= arr.length;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);*/
    }
    public static void rotate(char[] arr, int k){
        k=k%arr.length;
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    private static void reverse(char[] arr, int low, int high) {

        while(low<high) {
            char temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }

}
