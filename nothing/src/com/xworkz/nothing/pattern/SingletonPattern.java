package com.xworkz.nothing.pattern;

public class SingletonPattern {

    private SingletonPattern singletonPattern;

    private SingletonPattern(){
        System.out.println("private constructor of SingletonPattern class");
    }

    public SingletonPattern getInstance(){
        if(singletonPattern==null){
            singletonPattern= new SingletonPattern();
        }
        return  singletonPattern;
    }

    public static void main(String[] args) {

    }
}
