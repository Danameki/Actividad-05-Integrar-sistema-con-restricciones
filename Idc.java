
package com.mycompany.idc;

import java.util.Arrays;

public class Idc {

    int []arr;
    int longitud = 5;
    public static void main(String[] args) {
        int[] arr ={905, 210, 550, 102, 443}; 
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertion(int[] arr){
        int longitud = arr.length;
        for(int i=0;i<longitud;i++){
            int n =arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>n){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=n;
        }
    }
}
