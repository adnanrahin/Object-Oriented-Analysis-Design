package com.head.first.ooad.GuiterStore.versionThree.model;

import com.head.first.ooad.GuiterStore.versionThree.constants.Builder;
import com.head.first.ooad.GuiterStore.versionThree.constants.Type;
import com.head.first.ooad.GuiterStore.versionThree.constants.Wood;

import java.util.Objects;

public class GuitarSpec {

    private Builder builder;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private String model;

    public GuitarSpec() {

    }

    public GuitarSpec(Builder builder, Type type, Wood backWood, Wood topWood, String model) {
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GuitarSpec that = (GuitarSpec) o;
        return builder == that.builder && type == that.type && backWood == that.backWood && topWood == that.topWood && Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(builder, type, backWood, topWood, model);
    }

    @Override
    public String toString() {
        return "GuitarSpec{" +
                "builder=" + builder +
                ", type=" + type +
                ", backWood=" + backWood +
                ", topWood=" + topWood +
                ", model='" + model + '\'' +
                '}';
    }
}
