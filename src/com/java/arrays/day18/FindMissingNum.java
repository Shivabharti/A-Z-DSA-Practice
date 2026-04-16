package com.java.arrays.day18;

public class FindMissingNum {
    public static void main(String[] args) {
        int[] nums={8, 2, 4, 5, 3,7,1};
        //given size of nums is n-1//so integer will be in range of n+1
        int size= nums.length;
        int n= size+1;

        findMissingNum(nums, size, n);
    }

    private static void findMissingNum(int[] nums, int size, int n) {
        int sum= 0;
        for(int i=0; i<size; i++){
            sum +=nums[i];
        }
        //sum of first n num= n(n+1)/2
        long expectedSum = n*(n+1)/2;
        int missingNum= (int)expectedSum-sum;
        System.out.println("Missing num is: "+ missingNum);

    }
}
