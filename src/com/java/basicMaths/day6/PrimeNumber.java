package com.java.basicMaths.day6;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num: ");
        int n= sc.nextInt();
        primeNum(n);
    }
    public static void primeNum(int n){
        int count=0;
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                count++;
                if(n/i != i) {
                    count++;
                }
            }
        }
        if(count==2){
            System.out.println("Prime num");
        }
        else System.out.println("not a prime number");
    }
}
