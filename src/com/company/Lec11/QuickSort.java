package com.company.Lec11;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
       int[] nums = {6,2,8,1,5,3};

       quickSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void quickSort(int[] nums, int start, int end) {
        if (start >= end){
            return;
        }

        int p = pivot(nums, start, end);

        quickSort(nums, start, p-1);
        quickSort(nums, p+1, end);
    }

    public static int pivot(int[] nums, int start, int end) {
        int j = start;
        for (int i = start; i < end; i++) {
            if (nums[i] < nums[end]){
                swap(nums, i, j);
                j++;
            }
        }

        swap(nums, j, end);
        return j;
    }

    public static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
