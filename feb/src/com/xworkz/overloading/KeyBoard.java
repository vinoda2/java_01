package com.xworkz.overloading;

public class KeyBoard {


    //method overloading
    public static void type(){
        System.out.println("type method parameter-0");
        //invoking the method
        KeyBoard.type("Chaining Concept");
    }
    public static void type(String typedWord){
        System.out.println("type method parameter-1");
        System.out.println("typed word is:"+typedWord);
        KeyBoard.type();
    }
    public static void type(int wordCount){
        System.out.println("type method parameter-1");
        System.out.println("wordCount  is:"+wordCount);
    }
    public static int type(String typedWord,int wordCount){
        System.out.println("type method parameter-1");
        System.out.println("wordCount  is:"+wordCount);
        System.out.println("typed word is:"+typedWord);
        return wordCount;
    }
    public static int type(int wordCount,String typedWord){
        System.out.println("type method parameter-1");
        System.out.println("wordCount  is:"+wordCount);
        System.out.println("typed word is:"+typedWord);
        return wordCount;
    }

}
