package com.head.first.ooad.DogDoors.versionOne;

public class Application {

    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);

        System.out.println("Fido barks to go outside...");
        remote.pressButton();

        System.out.println("\nFido has gone outside...");

        System.out.println("\nFido’s all done...");

        System.out.println("\nFido’s back inside...");

    }

}
