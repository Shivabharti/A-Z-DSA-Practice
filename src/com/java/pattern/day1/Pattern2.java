package com.java.pattern.day1;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= sc.nextInt();
        pattern2(num);
    }

    public static void pattern2(int num){
        for(int i=0; i<num; i++){
            for(int j=0; j<=i ; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
