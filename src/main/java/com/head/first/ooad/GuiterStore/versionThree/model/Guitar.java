package com.head.first.ooad.GuiterStore.versionThree.model;

public class Guitar {

    private String serialNumber;
    private String model;
    private double price;
    private GuitarSpec guitarSpec;

    public Guitar(String serialNumber, String model, double price, GuitarSpec guitarSpec) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.price = price;
        this.guitarSpec = guitarSpec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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



}
