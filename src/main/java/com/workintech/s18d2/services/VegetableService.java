package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.entity.Vegetable;

import java.util.List;
import java.util.Optional;

public interface VegetableService {
    List<Vegetable> findAll();
    Vegetable save(Vegetable vegetable);
    Vegetable getById(Long id);
    Vegetable delete(Long id);
    List<Vegetable> getByPriceDesc();
    List<Vegetable> getByPriceAsc();
    List<Vegetable> searchByName(String name);
}
