package com.java.pattern.day2;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num= sc.nextInt();
        pattern10(num);
    }
    public static void pattern10(int num) {
        for (int i = 1; i <= 2*num - 1; i++) {
            int star= i;
            if(i>num){
                star= (2*num -i);
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
