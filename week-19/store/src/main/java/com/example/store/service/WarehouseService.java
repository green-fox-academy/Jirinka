package com.example.store.service;

import com.example.store.model.Warehouse;

import java.util.List;

public interface WarehouseService {

    List<Warehouse> getAllItems();
    List<String> getAllSizes();
    List<String> getAllNames();
    Warehouse getItem(String itemName, String size);
    Float getSum(Warehouse warehouse, Integer quantity);
    List<Warehouse> getFiltered(Integer price, String type);

}
