package com.java.recursion.day7;

import java.util.Scanner;

public class Print1ToNByBacktracking {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num: ");
        int n= sc.nextInt();
        print1toN(n,n);
    }
    public static void print1toN(int i, int n){
        if(i<1){
            return;
        }
        print1toN(i-1,n);
        System.out.println(i);
    }
}
