package com.java.arrays.day14;

import java.util.Scanner;

public class LargestElementinArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size:");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter num of array:");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        largestElement(arr, n);
    }

    private static void largestElement(int[] arr, int n) {
        int largest= arr[0];
        for(int num: arr){
            if(num>largest){
                largest=num;
            }
        }
        System.out.println("Largest element is" +largest);
    }
}
