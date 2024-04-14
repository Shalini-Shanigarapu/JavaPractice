package com.learn.Arrays;

public class SubStringReverse {

    public static String reverseWord(String word){
        String reversedWord =" ";
        for (int i=word.length()-1;i>=0;i--){
            reversedWord +=word.charAt(i);
        }
        return reversedWord;
    }
    public static void main(String[] args) {
        String sentence ="Hello World I love Selenium";
        String[] words=sentence.split(" ");
        String reversedSentence="";
        for(int i= words.length-1;i>=0;i--){
            reversedSentence += reverseWord(words[i]);
        }
        reversedSentence=reversedSentence.trim();
        System.out.println(reversedSentence);

    }
}


