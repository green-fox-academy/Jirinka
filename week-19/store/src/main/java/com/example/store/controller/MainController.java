package com.example.store.controller;

import com.example.store.DTO.WarehouseDTO;
import com.example.store.model.Warehouse;
import com.example.store.service.WarehouseServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {

    private final WarehouseServiceImpl warehouseService;

    public MainController(WarehouseServiceImpl warehouseService) {
        this.warehouseService = warehouseService;
    }

    @GetMapping("/shoppingplanner")
    public String getMainPage(Model model){
        model.addAttribute("warehouse", warehouseService.getAllItems());
        model.addAttribute("sizes", warehouseService.getAllSizes());
        model.addAttribute("names", warehouseService.getAllNames());
        return "main-page";
    }
    @PostMapping("/shoppingplanner/summary")
    public String sum(String name, String size, Integer quantity, Model model){
        Warehouse warehouse = warehouseService.getItem(name,size);
        model.addAttribute("order", warehouse);
        model.addAttribute("quantity", quantity);
        model.addAttribute("summary", warehouseService.getSum(warehouse,quantity));
        return "summary";
    }
    @GetMapping("/shoppingplanner/query")
    @ResponseBody
    WarehouseDTO filter(@RequestParam Integer price, String type){

        List<Warehouse> clothes = warehouseService.getFiltered(price, type);
        if(clothes.isEmpty()){
            return new WarehouseDTO("no clothes available", clothes);
        } else return new WarehouseDTO("ok", clothes);
    }

}
