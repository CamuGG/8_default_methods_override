package org.example;

import java.util.Objects;

public class SmartphonePrice implements Cloneable{
    private String priceType;
    private double priceInEuros;

    public SmartphonePrice(String priceType, double priceInEuros){
        this.priceType = priceType;
        this.priceInEuros = priceInEuros;
    }

    @Override
    public Object clone() {
        try {
            return (SmartphonePrice) super.clone();
        }catch (CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return priceType + " " + priceInEuros;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return  false;

        SmartphonePrice smartphonePrice1 = (SmartphonePrice) obj;

        return priceType == smartphonePrice1.priceType &&
                priceInEuros == smartphonePrice1.priceInEuros;
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }
}

