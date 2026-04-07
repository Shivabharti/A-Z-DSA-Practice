package com.java.recursion.day7;

import java.util.Scanner;

public class SumOfFirstnNumberMethod {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num: ");
        int n= sc.nextInt();
        System.out.println(printSum(n));
    }
    public static int printSum(int n){
        if(n==0){
            return 0;
        }
        return n+ printSum(n-1);
    }
}
