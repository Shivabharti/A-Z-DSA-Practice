package com.java.basicMaths.day6;

import java.util.Scanner;

//using Euclidean Algorithm here

public class GCDorHCF {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st num: ");
        int num1= sc.nextInt();
        System.out.println("Enter 2nd num: ");
        int num2= sc.nextInt();
        greatestCommonDivisor(num1, num2);
    }
    public static void greatestCommonDivisor(int num1, int num2){
        while(num1>0 && num2>0){
            if(num1>num2){
                num1=num1%num2;
            }else{
                num2=num2%num1;
            }
        }
        if(num1==0){
            System.out.println(num2);
        }else {
            System.out.println(num1);
        }
    }
}
