package de.sadrab.Mp13TheMagic8Ball.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
    String page(Model model) {
        model.addAttribute("name", getRandomName());
        return "home";
    }

    private String getRandomName() {
        List<String> names = new ArrayList<>();
        names.add("Sadra");
        names.add("Nana");
        names.add("Ali");
        names.add("Hadi");
        names.add("El");
        Collections.shuffle(names);
        return names.get(0);
    }
}
