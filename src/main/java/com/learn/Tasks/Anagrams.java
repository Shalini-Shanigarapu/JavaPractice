package com.learn.Tasks;



import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String str1="heart";
        String str2="earth";
        if (anagram(str1,str2)){
            System.out.println(str1+" and "+str2+" are Anagrams");
        }else{
            System.out.println(str1+" and "+str2+" are not Anagrams");
        }
    }
    public static boolean anagram(String str1,String str2) {
        if (str1.length() != str2.length()) {
            return false;
        } else {
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            return Arrays.equals(charArray1, charArray2);

        }
    }
}
