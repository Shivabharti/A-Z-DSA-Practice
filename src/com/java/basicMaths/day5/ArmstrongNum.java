package com.java.basicMaths.day5;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        System.out.println(armstrongNum(n));
    }

    public static boolean armstrongNum(int n) {
        int sum=0;
        int temp=n;
        while(n > 0){
            int cubeofLastDigit= (int)Math.pow(n%10,3);
            sum= sum+cubeofLastDigit;
            n=n/10;
        }
        System.out.println(sum);
        return sum==temp;
    }
}
