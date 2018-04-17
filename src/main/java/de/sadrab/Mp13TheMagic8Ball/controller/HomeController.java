package de.sadrab.Mp13TheMagic8Ball.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    private Generator generator;

    public HomeController(Generator generator) {
        this.generator = generator;
    }

    @ModelAttribute("adjective")
    String adjective() {
        return generator.getAdjective();
    }

    @GetMapping
    String page(Model model) {
        model.addAttribute("name", generator.getRandomName());
        return "home";
    }
}
