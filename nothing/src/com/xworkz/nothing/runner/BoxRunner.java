package com.xworkz.nothing.runner;

import com.xworkz.nothing.things.*;
public class BoxRunner {
    public static void main(String[] args) {
        System.out.println("box runner");
        //create instance
        Box box =   new Box();
        Box box1 =   new Box();
        System.out.println("box:"+box.boxSize);
        System.out.println("box:"+box1.boxSize);

    }
}
