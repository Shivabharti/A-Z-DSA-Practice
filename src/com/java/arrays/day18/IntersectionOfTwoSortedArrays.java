package com.java.arrays.day18;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,4,5};
        int[] arr2 = {2,3,4, 4,5,6};
        int n= arr1.length;
        int m= arr2.length;
        findIntersection(arr1,arr2,n,m);
    }

    private static void findIntersection(int[] arr1, int[] arr2, int n, int m) {
        int i=0;
        int j=0;
        List<Integer> result = new ArrayList<>();
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr2[j]<arr1[i]){
                j++;
            }
            else{
                result.add(arr1[i]);
                i++;
                j++;
            }
        }
        System.out.println(result);
    }
}
