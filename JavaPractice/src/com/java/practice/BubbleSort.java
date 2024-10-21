package com.java.practice;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {8,3,0,7,5};
        bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubble(int[] arr, int row, int index){
        if (row==0){
            return;
        }
        if (index<row){
            if (arr[index] > arr[index+1]) {
                int temp = arr[index];
                arr[index] = arr[index+1];
                arr[index+1] = temp;

            }
            bubble(arr,row,index+1);
        }else{
            bubble(arr,row-1,0);
        }
    }
}
