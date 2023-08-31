package org.example;

public class SmartphoneTester {
    public static void main(String[] args) {
        SmartphonePrice producerPrice1 = new SmartphonePrice("Producer", 150.50);
        SmartphonePrice producerPrice2 = new SmartphonePrice("Producer", 200.50);
        SmartphonePrice retailPrice1 = new SmartphonePrice("Retail", 250.50);
        SmartphonePrice retailPrice2 = new SmartphonePrice("Retail", 350.50);

        Smartphone smartphone1 = new Smartphone("Samsung", "S15", 2500, producerPrice1, retailPrice1);
        Smartphone smartphone2 = new Smartphone("Apple", "S4", 1500, producerPrice2, producerPrice2);

        System.out.println(smartphone1.toString());
        System.out.println(smartphone2.toString());

        try {
            Smartphone smartphoneCloned = (Smartphone) smartphone2.clone();
            System.out.println(smartphoneCloned.toString());

            boolean cloneEqualsSmarphoneTwo = smartphone2.equals(smartphoneCloned);
            System.out.println("Clone smarphone is equal to smarphone2 ? " + cloneEqualsSmarphoneTwo);
        }catch (Exception e){
            System.out.println("clone error! " + e.getMessage());
            e.printStackTrace();
        }
    }
}
