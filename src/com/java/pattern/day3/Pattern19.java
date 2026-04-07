package com.java.pattern.day3;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= sc.nextInt();
        pattern19(num);
    }

    public static void pattern19(int num){
        for(int i= 1; i <= 2*num; i++){
            int star= num-i+1;
            if(i>num){
                star=i-num;
            }
            for(int j=1; j<=star; j++){
                System.out.print("* ");
            }
            int space= (i*2-2)*2;
            if(i>num){
                space= (2*num-i)*4;
            }
            for(int k=1; k<=space; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=star; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
