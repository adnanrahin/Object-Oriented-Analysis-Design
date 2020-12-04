package com.head.first.ooad.GuiterStore.versionThree.dao;

import com.head.first.ooad.GuiterStore.versionThree.model.Guitar;

import java.util.ArrayList;
import java.util.List;

public class InventoryDAO {

    private List<Guitar> guitars;

    public InventoryDAO() {
        this.guitars = new ArrayList<>();
    }

    public List<Guitar> getGuitars() {
        return guitars;
    }

    public void setGuitars(List<Guitar> guitars) {
        this.guitars = guitars;
    }

    public Guitar getGuitar(String serialNumber) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNumber))
                return guitar;
        }
        return null;
    }

    public List<Guitar> search(Guitar searchGuitar) {

        List<Guitar> guitarsList = new ArrayList<>();

        for (Guitar guitar : guitars) {
            if (guitar.getBuilder().toString().equalsIgnoreCase(searchGuitar.getBuilder().toString())
                    && guitar.getModel().equalsIgnoreCase(searchGuitar.getModel())
                    && guitar.getTopWood().toString().equalsIgnoreCase(searchGuitar.getTopWood().toString())
                    && guitar.getBackWood().toString().equalsIgnoreCase(searchGuitar.getBackWood().toString())
                    && guitar.getType().toString().equalsIgnoreCase(searchGuitar.getType().toString())
            ) guitarsList.add(guitar);
        }

        return guitarsList;
    }

    public void addGuitar(Guitar guitar) {
        guitars.add(guitar);
    }

    public void show() {
        guitars.forEach(System.out::println);
    }

    public void showTheSearchResult(List<Guitar> result) {
        result.forEach(System.out::println);
    }

}
