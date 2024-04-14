package com.learn.Arrays;

public class ReverseSubString {
    public static void main(String[] args) {
        String substrings = "Hello world I love Selenium";
        String[] words= substrings.split(" ");
        StringBuilder reversedString = new StringBuilder();
        for(String word : words)
        {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedString.append(reversedWord).append(" ");
        }
        String reverseSubString = reversedString.toString().trim();
        System.out.println(reversedString);
    }
}
