package com.java.sorting.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size : ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter nums for array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array before sorting: ");
        for(int num : arr){
            System.out.print(num +" ");
        }
        divide(arr,0,n-1);
        System.out.println("Array after sorting: ");
        for(int num : arr){
            System.out.print(num +" ");
        }
    }
    public static void divide(int[] arr, int low, int high){
        if(low>=high) return;
        int mid= (low + high) / 2;
        divide(arr,low, mid);
        divide(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
    public static void merge(int[] arr, int low, int mid, int high){
        List<Integer> temp= new ArrayList<>();
        int left= low;
        int right= mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                temp.add(arr[left]);
                left++ ;
            }
            else{
                temp.add(arr[right]);
                right++ ;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++ ;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++ ;
        }
        for(int i= low; i<=high; i++){
            arr[i] = temp.get(i-low);
        }
    }
}
