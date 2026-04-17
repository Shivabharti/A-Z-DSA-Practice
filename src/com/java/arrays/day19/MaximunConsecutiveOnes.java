package com.java.arrays.day19;

public class MaximunConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums={1,1,0,1,1,1,0,1,1};
        int n= nums.length;
        maxConsOne(nums,n);
    }

    private static void maxConsOne(int[] nums, int n) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count++;
                max = Math.max(count, max);
            }
            else {
                count = 0;
                }
            }
        System.out.println(max);
    }
}
