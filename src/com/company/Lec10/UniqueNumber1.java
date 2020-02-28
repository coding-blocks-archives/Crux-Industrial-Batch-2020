package com.company.Lec10;

public class UniqueNumber1 {
    public static void main(String[] args) {
        int[] nums = {1,2,5,3,1,5,2};

        System.out.println(getSingle(nums));
    }


    private static int getSingle(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = res ^ nums[i];
        }

        return res;
    }
}
