package com.xworkz.application.runner;

public class Dregree {
    public static void main(String[] args) {
        String degreeNames[] = {"BCA","BE","Btech","MCA","MSC"};
        System.out.println("accessing array elements using index number");


        //find the length of the array
        System.out.println("length of array elements:"+degreeNames.length);
        System.out.println("accessing array element by using for loop");
        for (int i = 0; i <degreeNames.length ; i++) {
            System.out.println(degreeNames[i]);
        }
        //reverse the array elements
        System.out.println("reversed array elements");
        for(int i = degreeNames.length-1;i>=0;i--){
            System.out.println(degreeNames[i]);
        }


    }
}
