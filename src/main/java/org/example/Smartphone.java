package org.example;

import java.util.Objects;

public class Smartphone implements Cloneable{
    private String brandName;
    private String modelName;
    private int batterymAh;
    private SmartphonePrice producerPrice;
    private SmartphonePrice retailPrice;


    public Smartphone(String brandName, String modelName, int batterymAh, SmartphonePrice producerPrice, SmartphonePrice retailPrice) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.batterymAh = batterymAh;
        this.producerPrice = producerPrice;
        this.retailPrice = retailPrice;
    }

    @Override
    public String toString() {
        return "Smartphone details"
                + "\n"
                + "\nBrand: " + brandName
                + "\nModel: " + modelName
                + "\nBattery: " + batterymAh
                + "\nProducer price: " + producerPrice
                + "\nRetail price: " + retailPrice
                + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return  false;

        Smartphone smartphone1 = (Smartphone) obj;

        return brandName == smartphone1.brandName &&
                modelName == smartphone1.modelName &&
                batterymAh == smartphone1.batterymAh &&
                producerPrice == smartphone1.producerPrice &&
                retailPrice == smartphone1.retailPrice;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymAh, producerPrice, retailPrice);
    }

    @Override
    public Object clone() {
        try {
            return (Smartphone) super.clone();
        }catch (CloneNotSupportedException e){
            throw  new RuntimeException(e);
        }
    }
}
