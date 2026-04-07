package com.java.recursion.day7;

import java.util.Scanner;

public class FactorialOfNusingMethod {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num: ");
        int n= sc.nextInt();
        System.out.println(printMult(n));
    }
    public static int printMult(int n){
        if(n==0){
            return 1;
        }
        return n* printMult(n-1);
    }
}
