package ru.javarush.november.timberg.island.living_objects.animals.herbivores;

import ru.javarush.november.timberg.island.living_objects.animals.Animals;
import ru.javarush.november.timberg.island.living_objects.animals.Herbivore;

import java.util.Map;

import static ru.javarush.november.timberg.island.field.Config.*;

public class Buffalo extends Herbivore {
    double weight = (double) Math.round((Math.random() * ((BUFFALO_WEIGHT - (BUFFALO_WEIGHT * MINIMUM_WEIGHT_INDEX) + 1)) + (BUFFALO_WEIGHT * MINIMUM_WEIGHT_INDEX)) * 100) / 100;

    @Override
    public double getMaxWeight() {
        return BUFFALO_WEIGHT;
    }

    @Override
    public double getMaxPopulation() {
        return BUFFALO_MAX_POPULATION;
    }

    @Override
    public double getMaxSpeed() {
        return BUFFALO_MAX_SPEED;
    }

    @Override
    public double getSatiety() {
        return BUFFALO_SATIETY;
    }

    @Override
    public String getUnicode() {
        return BUFFALO_UNICODE;
    }

    @Override
    public String toString() {
        return "Buffalo " + getUnicode();
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
        return BUFFALO_EATING_MAP;
    }
}