package com.java.arrays.day18;

import java.util.ArrayList;
import java.util.List;

public class UnionArray {
    public static void main(String[] args) {

        int[] arr1 = {1,1,2,3,4,5};
        int[] arr2 = {2,3,4, 4,5,6};
        int n= arr1.length;
        int m= arr2.length;
        findUnion(arr1, arr2, n, m);
    }

    private static void findUnion(int[] arr1, int[] arr2, int n, int m) {
        int i=0;
        int j= 0;
        List<Integer> unionList = new ArrayList<>();
        while(i<n && j<m){
            if(arr1[i] <= arr2[j]){
                if(unionList.isEmpty() || unionList.get(unionList.size()-1) != arr1[i]){
                    unionList.add(arr1[i]);
                }
                i++;
            }
            else if(arr2[j]<= arr1[i]){
                if(unionList.isEmpty() || unionList.get(unionList.size()-1) != arr2[j]){
                    unionList.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<n){
            if(unionList.isEmpty() || unionList.get(unionList.size()-1) != arr1[i]){
                unionList.add(arr1[i]);
            }
            i++;
        }
        while(j<m){
            if(unionList.isEmpty() || unionList.get(unionList.size()-1) != arr2[j]){
                unionList.add(arr2[j]);
            }
            j++;
        }
        System.out.println(unionList);
    }
}
