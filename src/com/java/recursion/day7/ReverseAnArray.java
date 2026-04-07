package com.java.recursion.day7;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a num: ");
        int n= sc.nextInt();
        int[] nums= new int[n];
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        reverseArray(0, nums, n);
        System.out.println(Arrays.toString(nums));
    }
    public static void reverseArray(int i, int[] nums, int n){
        if(i>=n/2){
            return;
        }
        int temp = nums[i];
        nums[i] = nums[n - i - 1];
        nums[n - i - 1] = temp;
        reverseArray(i+1,nums,n);
    }
}
