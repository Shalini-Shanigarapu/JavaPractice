package com.learn.exceptions;

public class TypesOfExceptions {

    public static void main(String[] args) {

        TypesOfExceptions ae = new TypesOfExceptions();
        ae.arthimeticException();
        ae.nullPointerException();
        ae.arrayIndexOutOfBoundsException();
        ae.stringIndexOutOfBoundsException();


    }
    public void arthimeticException() {
        try {
            int a = 4/0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
            //e.printStackTrace();
        }
        System.out.println("exception");

    }

    public void nullPointerException() {
        String str = null;
        try {
            int length = str.length();

        }
        catch (NullPointerException e) {

            System.out.println(e.toString());
            System.out.println("length");
            //e.printStackTrace();

        }
    }
    public void arrayIndexOutOfBoundsException(){
        try {
            int b[] = {1, 3, 4, 4, 52, 4};
            System.out.println(b[8]);
        }
        catch(ArrayIndexOutOfBoundsException ai){
            System.out.println(ai.toString());

        }
    }
    public void stringIndexOutOfBoundsException(){
        try {
            String str = "shalini";
            char ch = str.charAt(7);
        }
        catch(StringIndexOutOfBoundsException sio){
            System.out.println(sio.toString());
        }

    }
}
