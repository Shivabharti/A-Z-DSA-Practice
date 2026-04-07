package com.java.pattern.day3;

import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= sc.nextInt();
        pattern20(num);
    }

    public static void pattern20(int num){
        for(int i= 1; i <= 2*num-1; i++){
            int star= i;
            if(i>num){
                star=2*num-i;
            }
            for(int j=1; j<=star; j++){
                System.out.print("*");
            }
            int space= 2*(num-i);
            if(i>num){
                space= (i-num)*2;
            }
            for(int k=1; k<=space; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=star; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
