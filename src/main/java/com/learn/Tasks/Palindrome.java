package com.learn.Tasks;

public class Palindrome {

    public static boolean palindromeString(String str){
        String revere ="";
        for(int i=str.length()-1;i>=0;i--){
            revere+=str.charAt(i);
        }
        return str.equals(revere);
    }
    public static void main(String[] args) {
        String input="level";
        if(palindromeString(input)){
            System.out.println("Palindrome String : "+input);
        }else{
            System.out.println("Not a Palindrome String :"+input);
        }

    }
}
