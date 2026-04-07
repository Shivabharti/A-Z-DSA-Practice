package com.java.recursion.day7;

import java.util.Scanner;
// Time complexity and Space Complexity: O(N)
public class PrintNameNTimes {
    public static void main(String[] args) {
        int i=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num: ");
        int n= sc.nextInt();
        printName(i, n);
    }
    public static void printName(int i, int n){
        if(i>n){
            return;
        }
        System.out.println(i+ " Shivangi");
        printName(i+1, n);
    }
}
