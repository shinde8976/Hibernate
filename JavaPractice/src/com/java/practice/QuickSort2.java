package com.java.practice;

import java.util.Arrays;

public class QuickSort2 {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        quickSort(arr, 0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] nums, int low, int hi){
        if (low>=hi){
            return;
        }
        int s = low;
        int e = hi;
        int m = (s+e)/2;
        int pivot = nums[m];

        while (s<=e){
            while (nums[s]<pivot){
                s++;
            }
            while (nums[e]>pivot){
                e--;
            }
            if (s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        quickSort(nums, low,s);
        quickSort(nums,e,hi);
    }
}
