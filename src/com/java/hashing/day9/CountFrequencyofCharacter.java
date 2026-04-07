package com.java.hashing.day9;

import java.util.Scanner;

public class CountFrequencyofCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter a string :");
        s= sc.next();

        //Precomputing
        int[] hash= new int[256];
        for(int i=0; i<s.length();i++){
            hash[s.charAt(i)]++;
        }

        System.out.println("Enter no. of queries: ");
        int query= sc.nextInt();
        while(query-- >0){
            char c;
            c= sc.next().charAt(0);
            System.out.println(hash[c]);
        }
    }
}
