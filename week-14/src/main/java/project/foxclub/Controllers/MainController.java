package project.foxclub.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import project.foxclub.Repository.Foxes;
import project.foxclub.Service.FoxService;

@Controller
public class MainController {

    public final FoxService foxService;

    public MainController(FoxService foxService, Foxes foxes) {
        this.foxService = foxService;
    }


    @GetMapping("/")
    public String mainPage(@RequestParam String name, Model model){
        model.addAttribute("fox", foxService.getFox(name));
        return "information";
        //return "index";
    }

    @GetMapping("/login")
        public String getLogin(){
        return "login";
    }
    @PostMapping("/login")
    public String postLogin(Model model, @RequestParam (value = "name") String name){
        model.addAttribute("fox", foxService.getFox(name));
        return  "redirect:/?name=" + name;
        //return "information";
        }

    @GetMapping("/nutritionStore")
        public String nutritionStore(@RequestParam String name, Model model){
        model.addAttribute("fox", foxService.getFox(name));
        return "nutritionStore";
    }


}
