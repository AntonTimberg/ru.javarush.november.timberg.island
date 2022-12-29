package ru.javarush.november.timberg.island.living_objects.animals.herbivores;

import ru.javarush.november.timberg.island.living_objects.animals.Animals;
import ru.javarush.november.timberg.island.living_objects.animals.Herbivore;

import java.util.Map;

import static ru.javarush.november.timberg.island.field.Config.*;

public class Mouse extends Herbivore {
    double weight = (double) Math.round(((Math.random() * (MOUSE_WEIGHT - (MOUSE_WEIGHT * MINIMUM_WEIGHT_INDEX))) + (MOUSE_WEIGHT * MINIMUM_WEIGHT_INDEX)) * 100) / 100;

    public double getMaxWeight() {
        return MOUSE_WEIGHT;
    }

    public double getMaxPopulation() {
        return MOUSE_MAX_POPULATION;
    }

    public double getMaxSpeed() {
        return MOUSE_MAX_SPEED;
    }

    public double getSatiety() {
        return MOUSE_SATIETY;
    }

    public String getUnicode() {
        return MOUSE_UNICODE;
    }

    @Override
    public String toString() {
        return "Mouse " + getUnicode();
    }

    @Override
    public double getCurrentWeight() {
        return weight;
    }

    @Override
    public void setCurrentWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public Map<Animals, Integer> getEatingProbability() {
        return MOUSE_EATING_MAP;
    }
}