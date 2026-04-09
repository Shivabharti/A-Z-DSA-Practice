package com.java.sorting.day11;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSorting {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size: ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter number for array: ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Array before sorting: "+ Arrays.toString(arr));
        for(int i=n-1; i>=0; i--){
            for (int j=0; j<=i-1; j++){
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array after sorting: "+ Arrays.toString(arr));
    }
}
