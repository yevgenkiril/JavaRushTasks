package com.javarush.task.pro.javaLessons.Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;

public class GardenBed {
    static {
        Date date = new Date();
        System.out.println("Текущая дата: " + date);
    }

    private ArrayList<Plant> wateredPlants = new ArrayList<>();

    private int total;

    private final ArrayList<Plant> plants;

    public GardenBed(ArrayList<Plant> plants) {
        this.plants = plants;
    }

    public void toWatered() {
        for (Plant plant : plants) {
            if (plant.getStatus().equals(Status.NEED_TO_BE_WATERED)) {
                plant.setStatus(Status.WATERED);
                wateredPlants.add(plant);
                for (int i = 0; i < plant.getQuantity(); i++) {
                    System.out.println("Растение " + plant + " было полито");
                }
            }
        }
    }

    public void aFewMomentsLater() {
        for (Plant plant1 : plants) {
            if (plant1.getStatus().equals(Status.WATERED)) {
                plant1.setStatus(Status.READY);
                for (int i = 0; i < plant1.getQuantity(); i++) {
                    System.out.println("Растение " + plant1 + " созрело. Пора собирать урожай!");
                }
            }
        }
    }

    public void harvest() {
        Iterator<Plant> plantIterator = plants.iterator();
        while (plantIterator.hasNext()) {
            Plant nextPlant = plantIterator.next();
            if (nextPlant.getStatus().equals(Status.READY) || nextPlant.getStatus().equals(Status.SPOILED)) {
                if (!wateredPlants.contains(nextPlant)) {
                    total += nextPlant.getQuantity();
                }
                plantIterator.remove();
                System.out.println("Растения " + nextPlant + " были собраны с грядки");
            }
        }
        System.out.println("Общее количество собраных растений равно " + total);
    }

    public void contains(Object plant) {
        Object found = null;

        if (plant instanceof String) {
            String name = (String) plant;
            for (Plant plan : plants) {
                if (plan.getName().equals(name)) {
                    found = plan.getName();
                    break;
                }
            }
        } else if (plant instanceof Plant p) {
            if (plants.contains(p)) {
                found = p;
            }
        }

        if (found != null) {
            System.out.println("растение " + found +  "найдено");
        } else {
            System.out.println("растение " + found + "не найдено");
        }
    }

    public void containSwitch(Object plant) {
        Object found1 = null;

        switch (plant) {
            case String name -> {
                for (Plant plan : plants) {
                    if (plan.getName().equals(name)) {
                        found1 = plan.getName();
                        break;
                    }
                }
            }
            case Plant plant1 -> {
                if (plants.contains(plant1)) {
                    found1=plant1;
                }
            }
            default -> System.out.println("Растение не найдено");
        }
        if (found1 != null) {
            System.out.println("растение " + found1 +  " найдено");
        } else {
            System.out.println("растение " + found1 + " не найдено");
        }
    }

    public void deletePlant(String name) {
        Iterator<Plant> plantIterator = plants.iterator();
        while (plantIterator.hasNext()) {
            Plant nextPlant = plantIterator.next();
            if (nextPlant.getName().equals(name)) {
                plantIterator.remove();
            }
        }
        System.out.println("Растение" + name + "было удалено");
    }


    public void isEmpty() {
        String emptyGardenBed = plants.isEmpty() ? "Грядка пустая" : "А нихуя блять...";
        System.out.println(emptyGardenBed);
    }

    public void sorting() {
        for (Plant plant : plants) {
            if (plant.getQuantity() % 2 == 0) {
                System.out.println(plant.getName() + " количество этих растений четное");
            } else System.out.println(plant.getName() + " а тут не четное");
        }
    }

    public void mainMethod() {
        toWatered();
        aFewMomentsLater();
        harvest();
        isEmpty();
    }
}
