package com.java.recursion.day7;

import java.util.Scanner;

public class PrintNto1ByBackTracking {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num: ");
        int n= sc.nextInt();
        int i=1;
        printNto1(i, n);
    }
    public static void printNto1(int i, int n){
        if(i>n){
            return;
        }
        printNto1(i+1,n);
        System.out.println(i);
    }
}
