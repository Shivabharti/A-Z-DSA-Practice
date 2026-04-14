package com.java.arrays.day16;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr= {1,7,4,8,0,9};
        int n= arr.length;
        secondLargestElement(arr, n);
    }

    private static void secondLargestElement(int[] arr, int n) {
        int largest= arr[0];
        int sLargest= -1;
        for(int i=1; i<n; i++){
            if(arr[i]>largest){
                sLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>sLargest){
                sLargest= arr[i];
            }
        }
        System.out.println("Second largest Element is: "+ sLargest);
    }
}
