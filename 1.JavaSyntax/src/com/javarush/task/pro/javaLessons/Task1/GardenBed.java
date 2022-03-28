package com.javarush.task.pro.javaLessons.Task1;

import java.util.ArrayList;

public class GardenBed {
    public static void toBeWatered(ArrayList<Plant> plants) {
        plants.remove(Status.NEED_TO_BE_WATERED);
        System.out.println(plants);
    }

    public static void addPlants(ArrayList<Plant> plants) {

        plants.addAll(plants);
    }
}
