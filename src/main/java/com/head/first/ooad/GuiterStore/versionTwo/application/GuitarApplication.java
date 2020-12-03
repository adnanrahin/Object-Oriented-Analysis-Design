package com.head.first.ooad.GuiterStore.versionTwo.application;

import com.head.first.ooad.GuiterStore.versionTwo.dao.InventoryDAO;
import com.head.first.ooad.GuiterStore.versionTwo.model.Guitar;
import com.head.first.ooad.GuiterStore.versionTwo.model.constants.Builder;
import com.head.first.ooad.GuiterStore.versionTwo.model.constants.Type;
import com.head.first.ooad.GuiterStore.versionTwo.model.constants.Wood;

public class GuitarApplication {

    public static void main(String[] args) {

        InventoryDAO inventoryDAO = new InventoryDAO();
        addDataSource(inventoryDAO);
        inventoryDAO.show();

        Guitar searchGuitar = new Guitar("123", "BOLT-125", Builder.COLLINGS, Type.ACOUSTIC, Wood.ADIRONDACK, Wood.BRAZILIAN_ROSEWOOD, 1200.44);

        if (inventoryDAO.search(searchGuitar) == null) {
            System.out.println("Guitar Does Not exist.");
        } else System.out.println("Guitar Found.");
    }

    public static void addDataSource(InventoryDAO inventoryDAO) {
        /*public Guitar(String serialNumber, String model, Builder builder, Type type, Wood backWood, Wood topWood, double price)*/
        inventoryDAO.addGuitar(new Guitar("123", "BOLT-125", Builder.FENDER, Type.ACOUSTIC, Wood.ADIRONDACK, Wood.BRAZILIAN_ROSEWOOD, 1200.44));
        inventoryDAO.addGuitar(new Guitar("123", "THUNDER-125", Builder.COLLINGS, Type.ELECTRIC, Wood.INDIAN_ROSEWOOD, Wood.BRAZILIAN_ROSEWOOD, 1500.55));
        inventoryDAO.addGuitar(new Guitar("123", "VOLT-555", Builder.GIBSON, Type.ELECTRIC, Wood.CEDAR, Wood.ALDER, 1500.54));
        inventoryDAO.addGuitar(new Guitar("123", "B-11125", Builder.MARTIN, Type.ACOUSTIC, Wood.COCOBOLO, Wood.CEDAR, 1250.47));
        inventoryDAO.addGuitar(new Guitar("123", "BOLT-107", Builder.RYAN, Type.ELECTRIC, Wood.MAHOGANY, Wood.ALDER, 12550.489));
    }

}
