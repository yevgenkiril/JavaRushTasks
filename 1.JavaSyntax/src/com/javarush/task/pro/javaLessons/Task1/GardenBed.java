package com.javarush.task.pro.javaLessons.Task1;

import java.util.ArrayList;
import java.util.Iterator;

public class GardenBed {
    private final ArrayList<Plant> plants;

    public GardenBed(ArrayList<Plant> plants) {
        this.plants = plants;
    }

    public void toWatered() {
        for (Plant plant : plants) {
            if (plant.getStatus().equals(Status.NEED_TO_BE_WATERED)) {
                plant.setStatus(Status.WATERED);
                for (int i = 0; i < plant.getQuantity(); i++) {
                    System.out.println("Растение " + plant + " было полито");
                }
            }
        }
    }
    public void aFewMomentsLater() {
        for (Plant plant1: plants) {
            if (plant1.getStatus().equals(Status.WATERED)) {
                plant1.setStatus(Status.READY);
                for (int i = 0; i < plant1.quantity; i++) {
                    System.out.println("Растение " + plant1 + " созрело. Пора собирать урожай!");
                }
            }
        }
    }
    public void harvest() {
        Iterator<Plant> plantIterator = plants.iterator();
        while (plantIterator.hasNext()) {
            Plant nextPlant = plantIterator.next();
            if (nextPlant.name.equals(Status.READY)) {
                plantIterator.remove();
            }
        }
        System.out.println("Растения " + plants + " были собраны с грядки");
    }

    public void contains() {
        System.out.println(plants.contains("Apple"));
        if (plants.isEmpty()){
            System.out.println("На данный помент грядка пуская");
        }else System.out.println("А нихуя блять...");
    }
}
