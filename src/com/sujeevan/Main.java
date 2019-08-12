package com.sujeevan;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions1 = new Dimensions(20, 20, 5);
        Case Case1 = new Case("220B", "Dell", "240", dimensions1);

        //Resolution resolution1  = new Resolution(20,15);
        Monitor Monitor1 = new Monitor("BeastScreen", "Acer", 20,
                new Resolution(1500, 2000));


        Motherboard Motherboard1 = new Motherboard("BJ200", "Asus", 4, 5, "V2.00");

        PC PC1 = new PC(Case1,Monitor1,Motherboard1);
       /* PC1.getTheMonitor().drawPixelAt(500,400,"Red");
        PC1.getTheMotherboard().Program("Windows 8");
        PC1.getTheCase().pressPowerButton();
*/
       PC1.powerUp();
       


    }
}
