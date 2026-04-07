package com.java.pattern.day2;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num= sc.nextInt();
        pattern6(num);
    }
    public static void pattern6(int num){
        for(int i=1; i<=num ; i++){
            for(int j= 1; j<=num-i+1; j++){
                System.out.print(" "+ j + " ");
            }
            System.out.println();
        }
    }
}
