package de.sadrab.Mp13TheMagic8Ball.controller;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class Generator {

    private List<String> adjective = new ArrayList<>();

    private List<String> names = new ArrayList<>();


    public String getAdjective() {
        adjective.add("The Best");
        adjective.add("The Smartest");
        adjective.add("The most Delayed");
        adjective.add("The Laziest");
        Collections.shuffle(adjective);
        return adjective.get(0);
    }

    public String getRandomName() {
        names.add("Sadra");
        names.add("Nana");
        names.add("Ali");
        names.add("Hadi");
        names.add("El");
        Collections.shuffle(names);
        return names.get(0);
    }
}
