package com.java.pattern.day3;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num= sc.nextInt();
        pattern18(num);
    }

    public static void pattern18(int num) {
        for (int i = 0; i < num; i++) {
            for (char ch= (char)('A'+num-1-i); ch<=(char)('A'+num-1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();

        }
    }
}
