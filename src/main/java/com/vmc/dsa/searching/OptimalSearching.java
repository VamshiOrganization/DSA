package com.vmc.dsa.searching;

import java.util.Arrays;

public class OptimalSearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {9,8,8,51,2,3,4,6,0,0,0};
		//hear size is n=11 values present m=8
		//  given an array m<n search for an element x target minimize the comparisons in code
		int m=8,n=arr.length,x=2;
		//System.out.println("element found:"+search(arr,m,n,x));
		
		System.out.println("element found:"+searchOptimal(arr,m,n,x));
		

	}

	private static boolean searchOptimal(int[] arr, int m, int n, int x) {
		arr[m]=x;
		System.out.println(Arrays.toString(arr));
		for(int i=0;arr[i]!=x;i++) {
			if(i==m) return true;
		}
		return false;
		
	}

	private static boolean search(int[] arr, int m, int n, int x) {
		
		for (int i = 0; i < m; i++) {
			if(arr[i]==x) {
				return true;
			}
		}
		return false;
	}
}
