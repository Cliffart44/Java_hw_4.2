package ru.netology.domain;

import java.util.Comparator;

public class PositionComparator implements Comparator<Position> {
    @Override
    public int compare(Position o1, Position o2) {
        return o1.flightTime() - o2.flightTime();
    }
}
