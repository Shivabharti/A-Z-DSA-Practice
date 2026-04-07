package com.java.pattern.day2;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num= sc.nextInt();
        pattern15(num);
    }

    public static void pattern15(int num) {

        for (int i = 1; i <= num; i++) {
            char ch='A';
            for (int j = 1; j <= num-i+1; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
