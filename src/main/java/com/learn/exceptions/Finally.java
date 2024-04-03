package com.learn.exceptions;

public class Finally {
    public static void main(String[] args){
        try {
            String str = "shalini";
            char ch = str.charAt(7);
        }
        catch(StringIndexOutOfBoundsException sio){
            System.out.println(sio.toString());
        }
        finally {
            System.out.println("close");
        }
    }
}
