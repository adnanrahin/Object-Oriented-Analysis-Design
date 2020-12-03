package com.head.first.ooad.GuiterStore.versionTwo.model.constants;

public enum Wood {

    INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY,
    MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;

    public String toString() {
        switch (this) {
            case ALDER:
                return "ALDER";
            case CEDAR:
                return "CEDAR";
            case MAPLE:
                return "MAPLE";
            case SITKA:
                return "SITKA";
            case COCOBOLO:
                return "COCOBOLO";
            case MAHOGANY:
                return "MAHOGANY";
            case ADIRONDACK:
                return "ADIRONDACK";
            case INDIAN_ROSEWOOD:
                return "INDIAN_ROSEWOOD";
            case BRAZILIAN_ROSEWOOD:
                return "BRAZILIAN_ROSEWOOD";
            default:
                return "";
        }
    }

}
