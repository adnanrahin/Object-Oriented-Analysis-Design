package com.head.first.ooad.GuiterStore.domain;

import java.util.Objects;

public class Guitar {

    private String serialNumber;
    private String builder;
    private String model;
    private String type;
    private String backWood;
    private String topWood;
    private double price;


    public Guitar(String serialNumber, String builder, String model, String type, String backWood, String topWood, double price) {
        this.serialNumber = serialNumber;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBackWood() {
        return backWood;
    }

    public void setBackWood(String backWood) {
        this.backWood = backWood;
    }

    public String getTopWood() {
        return topWood;
    }

    public void setTopWood(String topWood) {
        this.topWood = topWood;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guitar)) return false;
        Guitar guitar = (Guitar) o;
        return Objects.equals(getBuilder(),
                guitar.getBuilder()) && Objects.equals(getModel(),
                guitar.getModel()) && Objects.equals(getType(),
                guitar.getType()) && Objects.equals(getBackWood(),
                guitar.getBackWood()) && Objects.equals(getTopWood(), guitar.getTopWood());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getBuilder(),
                getModel(),
                getType(), getBackWood(),
                getTopWood());
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "serialNumber='" + serialNumber + '\'' +
                ", builder='" + builder + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", backWood='" + backWood + '\'' +
                ", topWood='" + topWood + '\'' +
                ", price=" + price +
                '}';
    }
}
