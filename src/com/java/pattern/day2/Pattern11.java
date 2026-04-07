package com.java.pattern.day2;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num= sc.nextInt();
        pattern11(num);
    }
    public static void pattern11(int num) {
        int start;
        for (int i = 0; i < num; i++) {
            if(i%2==0){
                start=0;
            }
            else{
                start=1;
            }
            for (int j = 0; j < i; j++) {
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }
}
