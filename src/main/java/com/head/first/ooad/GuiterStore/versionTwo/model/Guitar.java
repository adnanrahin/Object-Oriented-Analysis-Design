package com.head.first.ooad.GuiterStore.versionTwo.model;

import com.head.first.ooad.GuiterStore.versionTwo.model.constants.*;

import java.util.Objects;

public class Guitar {

    private String serialNumber, model;

    private Builder builder;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private double price;

    public Guitar(String serialNumber, String model, Builder builder, Type type, Wood backWood, Wood topWood, double price) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.builder = builder;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public void setBackWood(Wood backWood) {
        this.backWood = backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public void setTopWood(Wood topWood) {
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
        return Objects.equals(getModel(), guitar.getModel()) &&
                getBuilder() == guitar.getBuilder() &&
                getType() == guitar.getType() &&
                getBackWood() == guitar.getBackWood() &&
                getTopWood() == guitar.getTopWood();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getBuilder(), getType(), getBackWood(), getTopWood());
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "serialNumber='" + serialNumber + '\'' +
                ", model='" + model + '\'' +
                ", builder=" + builder +
                ", type=" + type +
                ", backWood=" + backWood +
                ", topWood=" + topWood +
                ", price=" + price +
                '}';
    }
}
