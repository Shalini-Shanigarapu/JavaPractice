package com.learn.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String str = "shalini";
        char[] c= str.toCharArray();
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        String str1 = "shalu";
        String reverse ="";
        for(int i=str1.length()-1;i>=0;i--){
            reverse+=str1.charAt(i);
        }
        System.out.println("   ReverseString:" + reverse);

        String str2 = "Chocolate";
        StringBuilder rev = new StringBuilder();
        for(int i=str2.length()-1;i>=0;i--){
            rev.append(str2.charAt(i));
        }
        System.out.println("Reverse String:" +rev);
    }
}
