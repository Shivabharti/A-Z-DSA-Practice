package com.java.pattern.day2;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num= sc.nextInt();
        pattern13(num);
    }

    public static void pattern13(int num) {
        int temp=1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(temp + " ");
                temp=temp+1;
            }
            System.out.println();
        }
    }
}
