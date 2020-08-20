package com.greenfoxacademy.webshop.Shop;

import com.greenfoxacademy.webshop.Model.ShopItems;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class WebShop {

    private List<ShopItems> items;

    public WebShop() {
        this.items = new ArrayList<>();
        items.add(new ShopItems("Tomato", "Fresh juicy tomato, 1pc.", 20, 65));
        items.add(new ShopItems("Mozzarella", "Handmade mozzarella from a farm.", 99, 43));
        items.add(new ShopItems("Prosciutto", "Yummy dried ham", 65, 0));
        items.add(new ShopItems("Onion", "Fresh onion from nearest field, 1pc.", 15, 16));
    }
    public List<ShopItems> getItems(){
        return items;
    }
   public List<ShopItems> getAvailableItems(){
        return items.stream()
                .filter(item -> (item.getQuantityOfStock() > 0))
                .collect(Collectors.toList());
    }
    public List<ShopItems> getSortedItems(){
        return items.stream().sorted(Comparator.comparing(ShopItems::getPrice)).collect(Collectors.toList());
    }
    public List<ShopItems> getFreshItems(){
        return items.stream()
                .filter(item->item.getName().toLowerCase().contains("fresh") || item.getDescription().toLowerCase().contains("fresh"))
                .collect(Collectors.toList());
    }
    public OptionalDouble getAverage(){
        return items.stream().mapToInt(number->number.getQuantityOfStock()).average();
    }
    public String getMax (){
        return items.stream().max(Comparator.comparing(ShopItems::getPrice)).stream().map(ShopItems::getName).collect(Collectors.joining());
    }
    public List<ShopItems> search(String text){
        return  items.stream()
                .filter(item -> item.getName().toLowerCase().contains(text.toLowerCase()) || item.getDescription().toLowerCase().contains(text.toLowerCase()))
                .collect(Collectors.toList());
    }
}
