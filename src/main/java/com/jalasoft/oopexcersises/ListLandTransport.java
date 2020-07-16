package com.jalasoft.oopexcersises;

import java.util.ArrayList;
import java.util.List;

public class ListLandTransport {
    private List<Land> lands;

    public ListLandTransport() {
        this.lands = new ArrayList<>();
    }

    public void addLand(Land land) {
        lands.add(land);
    }

    public void display() {
        lands.stream().map(Land::displayData).forEach(System.out::println);
    }
}
