package com.xworkz.nothing.things;

public class Box {

    //properties
    public String boxSize = "large";
    public String boxType = "plastic";
    public String boxShape = "round";

    //constructor
    public Box(){
        System.out.println("constructor without arguments");
    }

    //instance methods
    public void usage(){
        System.out.println("box usages");
    }


}
