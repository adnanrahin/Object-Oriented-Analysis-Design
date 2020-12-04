package com.head.first.ooad.GuiterStore.versionThree.constants;

public enum Type {

    ACOUSTIC, ELECTRIC;

    public String toString() {
        switch (this) {
            case ACOUSTIC:
                return "ACOUSTIC";
            case ELECTRIC:
                return "ELECTRIC";
            default:
                return "";
        }
    }
}
