package com.xworkz.nothing.things;

public interface SimCard {

    void getSimCardInformation();
    //java 8 features
    // default method
    //static method

    static void simType(){
        System.out.println("Sim type method");
    }

    default  void companyDetails(){
        System.out.println("Company details method");
    }

}
