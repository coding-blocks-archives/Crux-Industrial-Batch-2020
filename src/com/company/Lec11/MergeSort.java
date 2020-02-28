package com.company.Lec11;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
//        int[] first = {2,4,6};
//        int[] second = {1,3,8};
//
//        int[] res = merge(first,second);
//
//        System.out.println(Arrays.toString(res));

        int[] nums = {6,2,4,1,8,3};

        System.out.println(Arrays.toString(mergeSort(nums)));
    }

    public static int[] mergeSort(int[] nums){
        if (nums.length < 2){
            return nums;
        }

        int mid = nums.length / 2;
        int[] first = Arrays.copyOfRange(nums,0,mid);
        int[] second = Arrays.copyOfRange(nums,mid, nums.length);

        first = mergeSort(first);
        second = mergeSort(second);

        return merge(first, second);
    }

    public static int[] merge(int[] first, int[] second){
        int[] res = new int[first.length + second.length];

        int i = 0, j = 0, k = 0;

        while (i < first.length && j < second.length){
            if (first[i] < second[j]){
                res[k++] = first[i++];
            }else {
                res[k++] = second[j++];
            }
        }

        while (i < first.length){
            res[k++] = first[i++];
        }

        while (j < second.length){
            res[k++] = second[j++];
        }

        return res;
    }
}
