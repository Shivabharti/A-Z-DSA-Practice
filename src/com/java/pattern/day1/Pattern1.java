package com.java.pattern.day1;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= sc.nextInt();
    pattern1(num);
    }
    public static void pattern1(int num){
        for(int i=0; i<num; i++){
            for(int j=0; j<num ; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
