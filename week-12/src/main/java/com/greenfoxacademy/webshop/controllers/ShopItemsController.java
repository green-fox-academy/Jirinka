package com.greenfoxacademy.webshop.controllers;

import com.greenfoxacademy.webshop.Model.ShopItems;
import com.greenfoxacademy.webshop.Shop.WebShop;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ShopItemsController {

    WebShop webShop = new WebShop();

    @GetMapping("/webshop")
    public String homePage(Model model){
        model.addAttribute("items", webShop.getItems());
        return "homePage";
    }
    @GetMapping("/only-available")
    public String onlyAvailable (Model model){
        model.addAttribute("items", webShop.getAvailableItems());
        return "noHomePage";
    }
    @GetMapping("/cheapest-first")
    public String cheapestFirst(Model model){
        model.addAttribute("items", webShop.getSortedItems());
        return "noHomePage";
    }
    @GetMapping("/contains-fresh")
    public String containsFresh(Model model){
        model.addAttribute("items", webShop.getFreshItems());
        return "homePage";
    }
    @GetMapping("/average")
    public String average(Model model){
        model.addAttribute("average", webShop.getAverage().getAsDouble());
        return "averageStock";
    }
    @GetMapping("/maximum")
    public String maximum(Model model){
        model.addAttribute("maximum", webShop.getMax());
        return "mostExpensive";
    }
    @PostMapping("/search")
    public String search(Model model, @RequestParam (value = "searchField") String searchField){
        model.addAttribute("items", webShop.search(searchField));
        return "noHomePage";
    }





}
