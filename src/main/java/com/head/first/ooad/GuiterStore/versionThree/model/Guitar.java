package com.head.first.ooad.GuiterStore.versionThree.model;

import java.util.Objects;

public class Guitar {

    private String serialNumber;
    private double price;
    private GuitarSpec guitarSpec;

    public Guitar() {

    }

    public Guitar(String serialNumber, double price, GuitarSpec guitarSpec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.guitarSpec = guitarSpec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public GuitarSpec getGuitarSpec() {
        return guitarSpec;
    }

    public void setGuitarSpec(GuitarSpec guitarSpec) {
        this.guitarSpec = guitarSpec;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guitar guitar = (Guitar) o;
        return Double.compare(guitar.price, price) == 0 && Objects.equals(serialNumber, guitar.serialNumber) && Objects.equals(guitarSpec, guitar.guitarSpec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, price, guitarSpec);
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "serialNumber='" + serialNumber + '\'' +
                ", price=" + price +
                ", guitarSpec=" + guitarSpec +
                '}';
    }
}
