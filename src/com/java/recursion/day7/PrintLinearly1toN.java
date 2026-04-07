package com.java.recursion.day7;

import java.util.Scanner;

public class PrintLinearly1toN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num: ");
        int n= sc.nextInt();
        int count=1;
        print1Ton(count, n);
    }
    public static void print1Ton(int count, int n){
        if(count>n){
            return;
        }
        System.out.println(count);
        print1Ton(count+1, n);
    }
}
