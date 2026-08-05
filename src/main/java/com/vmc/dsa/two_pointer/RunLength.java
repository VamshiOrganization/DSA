package com.vmc.dsa.two_pointer;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class RunLength {
    public static void main(String[] args) {
        Object[] arr={'a','b','c','d','d','d','d','d','d','d','e','e'};
        Integer counter=1;
        int index=0;
        for (int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
              counter=counter+1;
                System.out.println(i+","+(i+1)+"-if");

                if(i+1==arr.length-1){
                    arr[index++] = arr[i];
                    arr[index++] = counter;
                }
            }else {
                System.out.println(i+","+(i+1)+"-else");
                if(index<arr.length) {
                    arr[index++] = arr[i];
                }
                if(counter>1){
                    arr[index] = arr[i];
                    arr[index++] = counter;
                    counter=1;

                }

            }
        }
        System.out.println(Arrays.toString(arr)+",counter:"+counter+",index:"+index);
        // hear my sub array start from zero(low=0) and ends at 7 high is (index+1)
        int low=0,high=index+1;

        for (int j = 0; j<index+1;j++){

        }
    }
}
