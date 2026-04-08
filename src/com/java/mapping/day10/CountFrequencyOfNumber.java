package com.java.mapping.day10;

import java.util.HashMap;
import java.util.Scanner;

public class CountFrequencyOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size= sc.nextInt();
        System.out.println("Enter numbers: ");
        int[] nums= new int[size];
        for(int i= 0; i<size; i++){
            nums[i]= sc.nextInt();
        }

        //Precomputing
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0; i<size; i++){
            int key= nums[i];
            int freq=0;
            if(mp.containsKey(key)){
                freq= mp.get(key);
            }
            freq++;
            mp.put(key,freq);
        }

        System.out.println("Enter no. of queries: ");
        int query= sc.nextInt();
        while(query-- > 0){
            int number=sc.nextInt();
            System.out.println(mp.getOrDefault(number,0));
        }
    }
}
