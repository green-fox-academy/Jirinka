package com.example.store.service;

import com.example.store.model.Warehouse;
import com.example.store.repository.WarehouseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WarehouseServiceImpl implements WarehouseService {

    private final WarehouseRepository warehouseRepository;

    public WarehouseServiceImpl(WarehouseRepository warehouseRepository) {
        this.warehouseRepository = warehouseRepository;
    }

    @Override
    public List<Warehouse> getAllItems() {
        return warehouseRepository.findAll();
    }

    @Override
    public List<String> getAllSizes() {
        return warehouseRepository.findAll().stream().map(Warehouse::getSize).distinct().collect(Collectors.toList());
    }

    @Override
    public List<String> getAllNames() {
        return warehouseRepository.findAll().stream().map(Warehouse::getItemName).distinct().collect(Collectors.toList());
    }

    @Override
    public Warehouse getItem(String itemName, String size) {
        return warehouseRepository.findByItemNameAndAndSize(itemName, size);
    }

    @Override
    public Float getSum(Warehouse warehouse, Integer quantity) {
        float price = warehouse.getUnitPrice();
        return price * quantity;
    }
    @Override
    public List<Warehouse> getFiltered(Integer price, String type) {
        List<Warehouse> allClothes = warehouseRepository.findAll();
        if (type.equals("lower")) {
            return allClothes.stream().filter(item -> item.getUnitPrice() < price).collect(Collectors.toList());
        } else if (type.equals("equals")) {
            return allClothes.stream().filter(item -> item.getUnitPrice() == price).collect(Collectors.toList());
        } else if (type.equals("higher")) {
            return allClothes.stream().filter(item -> item.getUnitPrice() > price).collect(Collectors.toList());
        }
        else return null;
    }
}
