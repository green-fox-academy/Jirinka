package com.example.spaceshiptransporter.Controller;

import com.example.spaceshiptransporter.Model.Planet;
import com.example.spaceshiptransporter.Model.Spaceship;
import com.example.spaceshiptransporter.Service.PlanetServiceImpl;
import com.example.spaceshiptransporter.Service.SpaceshipServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    public final PlanetServiceImpl planetService;
    public final SpaceshipServiceImpl spaceshipService;

    public MainController(PlanetServiceImpl planetService, SpaceshipServiceImpl spaceshipService) {
        this.planetService = planetService;
        this.spaceshipService = spaceshipService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("planets", planetService.getAllPlanets());
        return "index";
    }

    @PostMapping("/movehere/{id}")
    public String moveShip(@PathVariable long id) {
        if (spaceshipService.isSpaceshipHere(id)) {
            return "index";
        } else {
            spaceshipService.setSpaceship(id);

        }
        return "redirect:/";
    }
    @GetMapping("/toship/{id}")
    public String toShip(@PathVariable long id){
        spaceshipService.toShip(id);
        return "redirect:/";

    }
    @GetMapping("/toplanet/{id}")
    public String toPlanet(@PathVariable long id){
        spaceshipService.toPlanet(id);
        return "redirect:/";
    }
}





