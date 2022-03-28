package com.javarush.task.pro.javaLessons.Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Plant> garden = new ArrayList<>();
        garden.add(new Plant(Status.WATERED, "Apple", 3));
        garden.add(new Plant(Status.NEED_TO_BE_WATERED, "Flowers", 10));
        garden.add(new Plant(Status.NEED_TO_BE_WATERED, "Peach", 2));

        for (Plant plant : garden) {
            if (plant.getName() == null) {
                plant.setName("weeds");
            }
            System.out.println(plant);
        }

        GardenBed.addPlants(garden);
        GardenBed.toBeWatered(garden);

    }
}

