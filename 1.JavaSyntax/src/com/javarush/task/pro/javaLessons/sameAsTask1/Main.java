package com.javarush.task.pro.javaLessons.sameAsTask1;

import java.lang.reflect.Array;
import java.util.ArrayList;

//изменить плент через наследование и сделать 3 вида плентов(пример. овощи, ягоды и тд)
//по аналогии с тем что есть(грядкой) сделать 4 грядки. 3 для каждого вида растений(прмер. для ягод, для овощей и тд), а 4й общий для всех. тоесть грядки для овощей могут расти только овощи
//повторяещегося кода не должно быть. использовать абстрактные классы и/или интерфейсы и/или классы родители.
// повторить абстрактные классы;
public class Main {
    public static void main(String[] args) {
        ArrayList<Plant> garden = new ArrayList<>();
        ArrayList<Fruits> gardenForFruits = new ArrayList<>();
        ArrayList<Vegetables> gardenForVeg = new ArrayList<>();
        ArrayList<Greens> gardenForGreens = new ArrayList<>();

        /*garden.add(new Fruits(Status.NEED_TO_BE_WATERED, "Cherry", 1));
        garden.add(new Vegetables(Status.NEED_TO_BE_WATERED, "Tomato", 1));
        garden.add(new Fruits(Status.NEED_TO_BE_WATERED, "Watermelon", 1));
        garden.add(new Vegetables(Status.NEED_TO_BE_WATERED, "Garlic", 1));
        garden.add(new Greens(Status.NEED_TO_BE_WATERED, "Basil", 1));
*/
        gardenForFruits.add(new Fruits(Status.NEED_TO_BE_WATERED, "Cherry", 1));
        gardenForFruits.add(new Fruits(Status.NEED_TO_BE_WATERED, "Watermelon", 1));

        gardenForVeg.add(new Vegetables(Status.NEED_TO_BE_WATERED, "Tomato", 1));
        gardenForVeg.add(new Vegetables(Status.NEED_TO_BE_WATERED, "Garlic", 1));

        gardenForGreens.add(new Greens(Status.NEED_TO_BE_WATERED, "Basil", 1));

        garden.addAll(gardenForGreens);
        garden.addAll(gardenForFruits);
        garden.addAll(gardenForVeg);

        GardenBed<Fruits> gardenFruit = new GardenBed<>(gardenForFruits);
        GardenBed<Vegetables> gardenVegetable = new GardenBed<>(gardenForVeg);
        GardenBed<Greens> gardenGreen = new GardenBed<>(gardenForGreens);

        GardenBed<Plant> gardenBed = new GardenBed<>(garden);

        gardenFruit.toWatered();
        gardenGreen.toWatered();
        gardenVegetable.toWatered();
        //gardenBed.aFewMomentsLater();
        //gardenForFruits.toWatered();
        //gardenBed.harvest();
        /*gardenBed.contains("Tomato");
        gardenBed.contains(garden.get(1));
        gardenBed.containSwitch("Basil");
        gardenBed.containSwitch(garden.get(4));*/
        /*gardenBed.deletePlant("Basil");
        gardenBed.isEmpty();*/
    }
}
