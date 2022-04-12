package com.javarush.task.pro.javaLessons.Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Plant> garden = new ArrayList<>();
        garden.add(new Plant(Status.WATERED, "Apple", 3));
        garden.add(new Plant(Status.NEED_TO_BE_WATERED, "Flowers", 4));
        garden.add(new Plant(Status.NEED_TO_BE_WATERED, "Peach", 2));
        garden.add(new Plant(Status.READY, "Onion", 3));
        garden.add(new Plant(Status.SPOILED, "Orange", 2));

        Plant plant = new Plant(Status.READY, "Mango ", 5);

        GardenBed gardenBed = new GardenBed(garden);

        //gardenBed.toWatered();
        //gardenBed.aFewMomentsLater();
        // gardenBed.harvest();
        //gardenBed.isEmpty();
        //gardenBed.contains("Orange");
        //gardenBed.contains(garden.get(3));
        // gardenBed.mainMethod();
        // gardenBed.deletePlant("Flowers");
        // gardenBed.containSwitch("Orange");
        // gardenBed.containSwitch(garden.get(0));
        //gardenBed.containSwitch(plant);
       // gardenBed.sorting();

    }
}

