package com.head.first.ooad.GuiterStore.versionThree.application;

import com.head.first.ooad.GuiterStore.versionThree.dao.InventoryDAO;
import com.head.first.ooad.GuiterStore.versionThree.model.Guitar;
import com.head.first.ooad.GuiterStore.versionThree.model.constants.Builder;
import com.head.first.ooad.GuiterStore.versionThree.model.constants.Type;
import com.head.first.ooad.GuiterStore.versionThree.model.constants.Wood;

import java.util.List;

public class GuitarApplication {

    public static void main(String[] args) {

        InventoryDAO inventoryDAO = new InventoryDAO();
        addDataSource(inventoryDAO);

        Guitar searchGuitar = new Guitar("123", "BOLT-125", Builder.FENDER, Type.ACOUSTIC, Wood.ADIRONDACK, Wood.BRAZILIAN_ROSEWOOD, 1200.44);

        List<Guitar> searchResult = inventoryDAO.search(searchGuitar);

        inventoryDAO.showTheSearchResult(searchResult);

    }

    public static void addDataSource(InventoryDAO inventoryDAO) {
        /*public Guitar(String serialNumber, String model, Builder builder, Type type, Wood backWood, Wood topWood, double price)*/
        inventoryDAO.addGuitar(new Guitar("123", "BOLT-125", Builder.FENDER, Type.ACOUSTIC, Wood.ADIRONDACK, Wood.BRAZILIAN_ROSEWOOD, 1200.44));
        inventoryDAO.addGuitar(new Guitar("124", "THUNDER-125", Builder.COLLINGS, Type.ELECTRIC, Wood.INDIAN_ROSEWOOD, Wood.BRAZILIAN_ROSEWOOD, 1500.55));
        inventoryDAO.addGuitar(new Guitar("125", "VOLT-555", Builder.GIBSON, Type.ELECTRIC, Wood.CEDAR, Wood.ALDER, 1500.54));
        inventoryDAO.addGuitar(new Guitar("126", "B-11125", Builder.MARTIN, Type.ACOUSTIC, Wood.COCOBOLO, Wood.CEDAR, 1250.47));
        inventoryDAO.addGuitar(new Guitar("127", "BOLT-107", Builder.RYAN, Type.ELECTRIC, Wood.MAHOGANY, Wood.ALDER, 12550.489));
        inventoryDAO.addGuitar(new Guitar("128", "BOLT-125", Builder.FENDER, Type.ACOUSTIC, Wood.ADIRONDACK, Wood.BRAZILIAN_ROSEWOOD, 1600.56));
    }

}
