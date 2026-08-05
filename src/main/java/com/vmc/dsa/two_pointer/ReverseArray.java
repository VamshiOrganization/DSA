package com.vmc.dsa.two_pointer;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		char[] arr= {'a','b','c','d','e'};
		reverse(arr,0,4);
		
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
