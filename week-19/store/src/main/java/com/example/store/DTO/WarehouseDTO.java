package com.example.store.DTO;

import com.example.store.model.Warehouse;

import java.util.List;

public class WarehouseDTO {
    private String result;
    private List<Warehouse> list;

    public WarehouseDTO() {
    }

    public WarehouseDTO(String result, List<Warehouse> list) {
        this.result = result;
        this.list = list;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<Warehouse> getList() {
        return list;
    }

    public void setList(List<Warehouse> list) {
        this.list = list;
    }
}
