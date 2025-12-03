package com.example.javagyakszi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;

@Controller
public class StationController {
    @Autowired
    private StationRepo stationRepo;

    @GetMapping("/")
    public String Fooldal(Model model) { // Dependency injection
        model.addAttribute("station", stationRepo.findAll());
        return "index";
    }

    @GetMapping("/uj")
    public String UjStation(Model model) { // Dependency injection
        model.addAttribute("station", new Station());
        return "ujstation";

    }

    @PostMapping(value = "/ment")
    public String stationMentes(@ModelAttribute Station station) {
        stationRepo.save(station);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String stationModosit(@PathVariable(name = "id") int id, Model model) {
        model.addAttribute("station", stationRepo.findById(id));
        return "modosit";
    }

}
