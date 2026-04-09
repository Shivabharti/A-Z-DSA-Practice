package com.java.sorting.day11;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSorting {
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
        for(int i=0; i<n-1; i++){
            int min=i;
            for (int j=i; j<n; j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println("Array after sorting: "+ Arrays.toString(arr));
    }
}
