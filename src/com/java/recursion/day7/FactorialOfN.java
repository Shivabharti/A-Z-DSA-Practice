package com.java.recursion.day7;

import java.util.Scanner;

public class FactorialOfN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num: ");
        int n= sc.nextInt();
        int sum=1;
        printSum(n,sum);
    }
    public static void printSum(int n, int sum){
        if(n<1){
            System.out.println(sum);
            return;
        }
        printSum(n-1,sum*n);
    }
}
