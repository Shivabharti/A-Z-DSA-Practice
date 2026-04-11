package com.java.sorting.day13;

import java.util.Scanner;

public class InsertionSortRecursion {
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
        insertionSort(n, 0, arr);
        System.out.println("Array after sorting:");
        for(int i= 0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    private static void insertionSort(int n, int i, int[] arr) {
        if(i==n) return;
        int j=i;
        while(j>0 && arr[j]<arr[j-1]){
            int temp= arr[j-1];
            arr[j-1]= arr[j];
            arr[j]= temp;
            j--;
        }
        insertionSort(n, i+1, arr);
    }
}
