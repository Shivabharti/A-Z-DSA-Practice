package com.java.pattern.day2;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num= sc.nextInt();
        pattern8(num);
    }
    public static void pattern8(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * num - (2*i+ 1); k++) {
                System.out.print("*");
            }
//            for (int l = 0; l < i; l++) {
//                System.out.print(" ");
//            }
            System.out.println();
        }
    }
}
