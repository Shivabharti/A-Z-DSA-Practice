package com.java.day1;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= sc.nextInt();
        pattern4(num);
    }

    public static void pattern4(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i ; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
