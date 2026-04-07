package com.java.pattern.day2;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num= sc.nextInt();
        pattern12(num);
    }
    public static void pattern12(int num) {
        for (int i = 1; i <=num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for(int k=1; k<=2*(num-i);k++){
                System.out.print(" ");
            }
            int temp=i;
            for(int l= 1; l<=i;l++){
                System.out.print(temp);
                --temp;
            }
            System.out.println();
        }
    }
}
