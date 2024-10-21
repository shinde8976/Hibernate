package com.java.practice;

import java.util.Arrays;

public class SelectionSort1 {
    public static void main(String[] args) {
        int[] arr = {5,7,6,34,10};
        selectionSort(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr,int row,int index,int max){
        if (row ==0){
            return;
        }
        if (index<=row){
            if (arr[index]>arr[max]){
                selectionSort(arr,row,index+1,index);
            }else{
                selectionSort(arr,row,index+1,max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[row];
            arr[row]= temp;

            selectionSort(arr,row-1,0,0);
        }
    }
}
