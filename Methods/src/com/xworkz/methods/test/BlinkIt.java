package com.xworkz.methods.test;

public class BlinkIt {
   //1. method without return type and without parameters
    public static void search(){
        System.out.println("Hello i'm search method");
    }
    public static void search(String customerName){
        System.out.println("Hello i'm search method");
    }
    public static void search(String customerName,long contactNumber){
        System.out.println("Hello i'm search method");
    }
    public static void search(long contactNumber,String customerName){
        System.out.println("Hello i'm search method");
    }


   //2. method without return type and with parameters
   public static void order(String[] productName){
       System.out.println("Hello i'm order method");
       System.out.println("Product name is:"+productName);
   }


   public static void showItems(){
       System.out.println("Showing all the items");
       for (int i = 0; i < 5; i++) {
           System.out.println(i);
           return;
       }
   }
   //3. with return type and without parameters

   public static int getOrderNumber(){
       System.out.println("Welcome to BlinkIt here is your order number");
       return 89;
    }

   //4.  with return type and with parameters
    public static String getCustomerName(String customerName){
        System.out.println("Welcome to the Blink It");
        return customerName;
    }
}
