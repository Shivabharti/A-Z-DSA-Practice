package com.java.pattern.day2;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num= sc.nextInt();
        pattern14(num);
    }

    public static void pattern14(int num) {
        char ch='A';
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
            ch++;
        }
    }
}
