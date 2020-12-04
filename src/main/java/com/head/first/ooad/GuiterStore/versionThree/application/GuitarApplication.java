package com.head.first.ooad.GuiterStore.versionThree.application;

import com.head.first.ooad.GuiterStore.versionThree.constants.Builder;
import com.head.first.ooad.GuiterStore.versionThree.constants.Type;
import com.head.first.ooad.GuiterStore.versionThree.constants.Wood;
import com.head.first.ooad.GuiterStore.versionThree.dao.InventoryDAO;
import com.head.first.ooad.GuiterStore.versionThree.model.Guitar;
import com.head.first.ooad.GuiterStore.versionThree.model.GuitarSpec;

import java.util.List;

public class GuitarApplication {

    public static void main(String[] args) {

        InventoryDAO inventoryDAO = new InventoryDAO();
        loadData(inventoryDAO);
        //inventoryDAO.show();
        Guitar searchGuitar = new Guitar("1234", 1200.1333, new GuitarSpec(Builder.MARTIN, Type.ELECTRIC, Wood.INDIAN_ROSEWOOD, Wood.ALDER, "RDX-1010"));
        List<Guitar> searchResult = inventoryDAO.search(searchGuitar.getGuitarSpec());
        inventoryDAO.showTheSearchResult(searchResult);
    }

    public static void loadData(InventoryDAO inventoryDAO) {
        inventoryDAO.addGuitar(new Guitar("1234", 1200.1333, new GuitarSpec(Builder.MARTIN, Type.ELECTRIC, Wood.INDIAN_ROSEWOOD, Wood.ALDER, "RDX-1010")));
        inventoryDAO.addGuitar(new Guitar("5658", 2600.565, new GuitarSpec(Builder.MARTIN, Type.ELECTRIC, Wood.INDIAN_ROSEWOOD, Wood.ALDER, "RDX-1010")));
        inventoryDAO.addGuitar(new Guitar("1235", 1300.234, new GuitarSpec(Builder.RYAN, Type.ELECTRIC, Wood.ADIRONDACK, Wood.BRAZILIAN_ROSEWOOD, "MDX-1010")));
        inventoryDAO.addGuitar(new Guitar("1236", 1500.35, new GuitarSpec(Builder.GIBSON, Type.ELECTRIC, Wood.ALDER, Wood.CEDAR, "RTX-1010")));
        inventoryDAO.addGuitar(new Guitar("1237", 1600.47, new GuitarSpec(Builder.OLSON, Type.ELECTRIC, Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD, "OMEGA-1010")));
        inventoryDAO.addGuitar(new Guitar("1238", 1250.53, new GuitarSpec(Builder.FENDER, Type.ELECTRIC, Wood.CEDAR, Wood.ALDER, "ALPHA-1010")));
        inventoryDAO.addGuitar(new Guitar("1239", 1244.63, new GuitarSpec(Builder.GIBSON, Type.ELECTRIC, Wood.COCOBOLO, Wood.ADIRONDACK, "TIR-1010")));
        inventoryDAO.addGuitar(new Guitar("1232", 1205.73, new GuitarSpec(Builder.FENDER, Type.ELECTRIC, Wood.ADIRONDACK, Wood.ALDER, "RDX-1010")));
        inventoryDAO.addGuitar(new Guitar("1244", 1250.89, new GuitarSpec(Builder.COLLINGS, Type.ELECTRIC, Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK, "RDX-1010")));
    }

}
