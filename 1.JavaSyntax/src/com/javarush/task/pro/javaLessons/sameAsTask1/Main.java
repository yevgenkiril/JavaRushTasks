package com.javarush.task.pro.javaLessons.sameAsTask1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Fruits> gardenForFruits = new ArrayList<>();

        ArrayList<Fruits> testGarden = new ArrayList<>();// по этому поводу я тебе задавал вопрос телеге. в чем логика замены, если мы
        // заново создаем еще один лист с таким же типом <Fruit>. было бы проще в один добавить что нам надо и не париться. но я так понял,
        // что это задание было просто на понимание

        testGarden.add(new Fruits(Status.NEED_TO_BE_WATERED, "Apple", 1));

        gardenForFruits.add(new Fruits(Status.NEED_TO_BE_WATERED, "Cherry", 1));
        gardenForFruits.add(new Fruits(Status.NEED_TO_BE_WATERED, "Watermelon", 1));

        GardenBed<Fruits> x = new GardenBed<>(gardenForFruits);

        x.mainMethod();

       /* x.addPlants(gardenForFruits);
        x.toWatered();

        x.replacePlant(testGarden);
        x.toWatered();*/


    }
}
