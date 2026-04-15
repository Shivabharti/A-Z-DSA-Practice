package com.java.arrays.day17;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums= {0,7,8,4,1,9,1,0,2,7};
        int num= 1;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]==num){
                System.out.println(i);
                break;
            }
        }
    }
}
