package com.java.pattern.day2;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num= sc.nextInt();
        pattern9(num);
    }
    public static void pattern9(int num) {
        for(int i=0; i<num ; i++){
            for(int j= 0; j<num-i-1; j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*i+1; k++){
                System.out.print("*");
            }
            for(int l= 0; l<num-i-1 ; l++){
                System.out.print(" ");
            }
            System.out.println();
        }
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
