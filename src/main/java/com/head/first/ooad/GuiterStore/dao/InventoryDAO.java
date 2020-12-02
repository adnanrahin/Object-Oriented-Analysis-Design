package com.head.first.ooad.GuiterStore.dao;

import com.head.first.ooad.GuiterStore.domain.Guitar;

import java.util.ArrayList;
import java.util.List;

public class InventoryDAO {

    private List<Guitar> guitars = new ArrayList<>();

    private InventoryDAO(List<Guitar> guitars) {
        this.guitars = guitars;
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

    public Guitar search() {
        return null;
    }

}
