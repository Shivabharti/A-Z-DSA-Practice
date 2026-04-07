package com.java.pattern.day3;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num= sc.nextInt();
        pattern17(num);
    }

    public static void pattern17(int num) {

        for (int i = 0; i <= num; i++) {
            char ch='A';
            for(int j= 0; j<=num-i-1; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i+1; j++) {
                System.out.print(ch);
//                ch++;
                if(j<=(2*i+1)/2){
                    ch++;
                }
                else {
                    ch--;
                }
            }
            System.out.println();
        }
    }
}
