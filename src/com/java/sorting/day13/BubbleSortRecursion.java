package com.java.sorting.day13;

import java.util.Scanner;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENter size: ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("ENter number for array: ");
        for(int i= 0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Array before sorting:");
        for(int i= 0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        bubbleSort(n, arr);
        System.out.println("Array after sorting:");
        for(int i= 0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    private static void bubbleSort(int n, int[] arr) {
        if(n==1) return;
        for(int i= 0; i<n-1; i++){
            if(arr[i]> arr[i+1]){
                int temp= arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        bubbleSort(n-1, arr);
    }
}
