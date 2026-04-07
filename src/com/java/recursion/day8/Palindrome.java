package com.java.recursion.day8;

public class Palindrome {
    public static void main(String[] args) {
        String s= "MADSM";
        boolean result=palindromeCheck(0,s);
        System.out.println(result);
    }

    public static boolean palindromeCheck(int i, String s) {
        if(i>=s.length()/2){
            return true;
        }
        if (s.charAt(i) != s.charAt(s.length()-1-i)) {
            return false;
        }
        return palindromeCheck(i+1, s);
    }
}
