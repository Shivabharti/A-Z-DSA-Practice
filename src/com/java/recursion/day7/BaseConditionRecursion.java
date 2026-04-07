package com.java.recursion.day7;

public class BaseConditionRecursion {
    public static void main(String[] args) {
        m1();
    }
    static int count=0;
    public static void m1(){
        if(count==3){
            return;
        }
        System.out.println(count);
        count++;
        m1();
    }
}
