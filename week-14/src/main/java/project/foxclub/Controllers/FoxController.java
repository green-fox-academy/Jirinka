package project.foxclub.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import project.foxclub.Model.Drinks;
import project.foxclub.Model.Food;
import project.foxclub.Model.Fox;
import project.foxclub.Service.FoxService;

@Controller
public class FoxController {
    public final FoxService foxService;

    public FoxController(FoxService foxService) {
        this.foxService = foxService;
    }

    @PostMapping("/nutritionStore")
    public String changeNutrition(Model model, @RequestParam String name, @RequestParam Food food, @RequestParam Drinks drink){
    Fox fox = foxService.getFox(name);
    fox.setDrink(drink);
    fox.setFood(food);
    return "redirect:/?name=" + name;


    }
}
