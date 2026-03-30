package com.java.day1;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= sc.nextInt();
        pattern5(num);
    }

    public static void pattern5(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i+1 ; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
