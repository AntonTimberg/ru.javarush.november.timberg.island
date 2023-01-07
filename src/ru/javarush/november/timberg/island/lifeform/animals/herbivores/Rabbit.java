package ru.javarush.november.timberg.island.lifeform.animals.herbivores;

import ru.javarush.november.timberg.island.board.Cell;
import ru.javarush.november.timberg.island.lifeform.Organism;
import ru.javarush.november.timberg.island.lifeform.Plant;
import ru.javarush.november.timberg.island.lifeform.animals.Animal;
import ru.javarush.november.timberg.island.lifeform.animals.AnimalType;
import ru.javarush.november.timberg.island.lifeform.animals.action.Action;
import ru.javarush.november.timberg.island.lifeform.animals.action.EatAction;
import ru.javarush.november.timberg.island.lifeform.animals.action.MoveAction;
import ru.javarush.november.timberg.island.lifeform.animals.behavior.CanEat;
import ru.javarush.november.timberg.island.lifeform.animals.behavior.CanMove;

import java.util.List;
import java.util.Map;

import static ru.javarush.november.timberg.island.board.BoardSetting.RABBIT_MAX_SPEED;
import static ru.javarush.november.timberg.island.board.BoardSetting.RABBIT_SATIETY;
import static ru.javarush.november.timberg.island.board.BoardSetting.RABBIT_UNICODE;
import static ru.javarush.november.timberg.island.board.BoardSetting.RABBIT_MAX_WEIGHT;

public class Rabbit extends Animal {

    {
        probabilities = Map.of(Plant.class, 1D);
    }

    public double getMaxWeight() {
        return RABBIT_MAX_WEIGHT;
    }

    public int getMaxSpeed() {
        return RABBIT_MAX_SPEED;
    }

    @Override
    public double getMaxSatiety() {
        return RABBIT_SATIETY;
    }

    @Override
    public AnimalType getAnimalType() {
        return AnimalType.RABBIT;
    }

    public String getUnicode() {
        return RABBIT_UNICODE;
    }

    @Override
    public String toString() {
        return "Rabbit " + getUnicode();
    }
}
