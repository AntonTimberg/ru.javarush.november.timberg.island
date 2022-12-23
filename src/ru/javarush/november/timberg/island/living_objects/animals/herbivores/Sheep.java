package ru.javarush.november.timberg.island.living_objects.animals.herbivores;

import ru.javarush.november.timberg.island.living_objects.animals.Animals;
import ru.javarush.november.timberg.island.living_objects.animals.Herbivore;

import java.util.Map;

import static ru.javarush.november.timberg.island.field.Config.*;


public class Sheep extends Herbivore {
    double weight = (double) Math.round((Math.random() * ((SHEEP_WEIGHT - (SHEEP_WEIGHT * MINIMUM_WEIGHT_INDEX) + 1)) + (SHEEP_WEIGHT * MINIMUM_WEIGHT_INDEX)) * 100) / 100;

    public double getMaxWeight() {
        return SHEEP_WEIGHT;
    }

    public double getMaxPopulation() {
        return SHEEP_MAX_POPULATION;
    }

    public double getMaxSpeed() {
        return SHEEP_MAX_SPEED;
    }

    public double getSatiety() {
        return SHEEP_SATIETY;
    }

    public String getUnicode() {
        return SHEEP_UNICODE;
    }

    @Override
    public String toString() {
        return "Sheep " + getUnicode();
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
        return SHEEP_EATING_MAP;
    }
}
