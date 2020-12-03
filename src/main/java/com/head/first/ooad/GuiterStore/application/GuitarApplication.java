package com.head.first.ooad.GuiterStore.application;

import com.head.first.ooad.GuiterStore.dao.InventoryDAO;
import com.head.first.ooad.GuiterStore.domain.Guitar;

public class GuitarApplication {

    public static void main(String[] args) {

        InventoryDAO inventoryDAO = new InventoryDAO();
        addDataSource(inventoryDAO);
        inventoryDAO.show();

        Guitar searchGuitar = new Guitar("123", "FENDER",
                "BOLT-125", "ACOUSTIC", "INDIAN_ROSEWOOD", "BRAZILIAN_ROSEWOOD", 1200.44);

        if(inventoryDAO.search(searchGuitar) == null){
            System.out.println("Guitar Does Not exist.");
        }else System.out.println("Guitar Found.");

    }

    public static void addDataSource(InventoryDAO inventoryDAO) {
        /*public Guitar(String serialNumber, String builder, String model, String type, String backWood, String topWood, double price)*/
        inventoryDAO.addGuitar(new Guitar("123", "FENDER", "BOLT-125", "ACOUSTIC", "INDIAN_ROSEWOOD", "BRAZILIAN_ROSEWOOD", 1200.44));
        inventoryDAO.addGuitar(new Guitar("124", "FENDER", "RDX-800", "ACOUSTIC", "MAHOGANY", "ADIRONDACK", 1500.66));
        inventoryDAO.addGuitar(new Guitar("125", "FENDER", "THUNDER-125", "ACOUSTIC", "BRAZILIAN_ROSEWOOD", "COCOBOLO", 1500.44));
        inventoryDAO.addGuitar(new Guitar("126", "FENDER", "MDX-150", "ACOUSTIC", "COCOBOLO", "ADIRONDACK", 1800.44));
        inventoryDAO.addGuitar(new Guitar("127", "FENDER", "F-125", "ACOUSTIC", "ADIRONDACK", "BRAZILIAN_ROSEWOOD", 1600.90));
        inventoryDAO.addGuitar(new Guitar("128", "FENDER", "OMEN-125", "ACOUSTIC", "INDIAN_ROSEWOOD", "COCOBOLO", 1800.44));
    }

}
