package com.xworkz.nothing.things;

public class SimCardRunner {
    public static void main(String[] args) {
        SimCard simCard = new JioSimCard();
        simCard.getSimCardInformation();
        simCard.companyDetails();
    }
}
