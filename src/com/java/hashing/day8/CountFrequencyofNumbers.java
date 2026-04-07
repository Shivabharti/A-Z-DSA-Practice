package com.java.hashing.day8;

import java.util.Scanner;

public class CountFrequencyofNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size= sc.nextInt();
        int[] arr= new int[size];
        System.out.println("Enter numbers: ");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }
        //Precompute
        int[] hash= new int[13];
        for(int i= 0; i<size; i++){
            hash[arr[i]]++;
        }
        int query;
        System.out.println("Enter query: ");
        query= sc.nextInt();
        while(query-- != 0){
            int number= sc.nextInt();
            //fetch
            System.out.println(hash[number]);
        }
    }

}
