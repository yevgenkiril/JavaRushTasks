package com.javarush.task.pro.javaLessons.sameAsTask1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class GardenBed<P extends Plant> {
    private ArrayList<P> wateredPlant = new ArrayList<>();
    private int total;

    private final ArrayList<P> plants;

    public GardenBed(ArrayList<P> p) {
        this.plants = p;
    }

    public GardenBed() {
        plants = new ArrayList<>();
    }

    public void addPlant(P p) {
        plants.add(p);
    }

    public void addPlant(String name) {
        plants.add((P) new Plant(Status.NEED_TO_BE_WATERED, name, 1));
    }

    public void addPlants(ArrayList<P> p) {
        plants.addAll(p);
    }

    public void replacePlant(ArrayList<P> p) {
        plants.addAll(0, p);
    }

    public void toWatered() {
        for (P plant : plants) {
            if (plant.getStatus().equals(Status.NEED_TO_BE_WATERED)) {
                plant.setStatus(Status.WATERED);
                wateredPlant.add(plant);
                for (int i = 0; i < plant.getQuantity(); i++) {
                    System.out.println("Растение " + plant + " было полито ");
                }
            }
        }
    }

    public void toWateredStream() {
        plants.stream().filter(x -> x.getStatus().equals(Status.NEED_TO_BE_WATERED)).forEach(x -> {
            x.setStatus(Status.WATERED);
            wateredPlant.add(x);
            System.out.println("Растение " + x + " было полито ");
        });
    }

    public void aFewMomentsLater() {
        for (Plant plant : plants) {
            if (plant.getStatus().equals(Status.WATERED)) {
                plant.setStatus(Status.READY);
                for (int i = 0; i < plant.getQuantity(); i++) {
                    System.out.println("Растение " + plant + " созрело. Пора собирать урожай!");
                }
            }
        }
    }

    public void aFewMomentsLaterStream() {
        plants.stream().filter(x -> x.getStatus().equals(Status.WATERED)).forEach(x -> {
            x.setStatus(Status.READY);
            System.out.println("Растение " + x + " созрело. Пора собирать урожай!");
        });
    }

    public void harvest() {
        Iterator<P> plantIterator = plants.iterator();
        while (plantIterator.hasNext()) {
            Plant nextPlant = plantIterator.next();
            if (nextPlant.getStatus().equals(Status.READY) || nextPlant.getStatus().equals(Status.SPOILED)) {
                if (wateredPlant.contains(nextPlant)) {
                    total += nextPlant.getQuantity();
                }
                plantIterator.remove();
                System.out.println("Растения " + nextPlant + " были собраны с грядки");
            }
        }
        System.out.println("Общее количество собраных растений равно " + total);
    }


    public void eNum() {
        Status[] status = Status.values();
        for (Status s : status) {
            System.out.println(s);
        }
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
            System.out.println("растение " + found + " найдено");
        } else {
            System.out.println("растение " + found + " не найдено");
        }
    }

    public void containSwitch(Object plant) {
        Object found = null;

        switch (plant) {
            case String name -> {
                for (Plant plan : plants) {
                    if (plan.getName().equals(name)) {
                        found = plan.getName();
                        break;
                    }
                }
            }
            case Plant plant1 -> {
                if (plants.contains(plant1)) {
                    found = plant1;
                }
            }
            default -> System.out.println(" Растение не найдено.");
        }
        if (found != null) {
            System.out.println("растение " + found + " найдено");
        } else {
            System.out.println("растение " + found + " не найдено");
        }
    }

    public void deletePlant(String name) {
        plants.removeIf(nextPlant -> nextPlant.getName().equals(name));
        System.out.println("Растение " + name + " было удалено с грядки");
    }

    public void isEmpty() {
        String emptyGardenBed = plants.isEmpty() ? "Грядка пустая" : "На грядке есть растения " + plants;
        System.out.println(emptyGardenBed);
    }

    public void mainMethod() {
        toWatered();
        aFewMomentsLater();
        harvest();
        isEmpty();
    }
}
