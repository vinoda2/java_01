package com.xworkz.nothing.runner;

import com.xworkz.nothing.things.ApplicationInformation;

public class AppRunner {

    public static void main(String[] args) {
        System.out.println("main method stared");
        System.out.println("before assigning value:"+ApplicationInformation.app_names);
        for(String element : ApplicationInformation.app_names){
            System.out.println("element is:"+element);
        }
        ApplicationInformation.app_names[0]="Flipkart";
        System.out.println(ApplicationInformation.app_names);
        for(String element : ApplicationInformation.app_names){
            System.out.println("element is:"+element);
        }

        System.out.println("=======================================");
        for (int index = 0; index <= ApplicationInformation.typeofApp.length-1; index++) {
            System.out.println("element is:"+ ApplicationInformation.typeofApp[index]);
            if(ApplicationInformation.typeofApp[index].equalsIgnoreCase("Ecommerce")){
                System.out.println("it is  present");
            }

        }
    }
}
