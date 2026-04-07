package com.java.basicMaths.day6;

import java.util.Scanner;

public class PrintAllDivisor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num: ");
        int n= sc.nextInt();
        printDivisors(n);
    }
    public static void printDivisors(int n){
//        for(int i=1; i<=n; i++){
//            if(n%i==0){
//                System.out.println(i);
//            }
//        }
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                System.out.println(i);
                if(n/i != i) {
                    System.out.println(n / i);
                }
            }
        }
    }
}
