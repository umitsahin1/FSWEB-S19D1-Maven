package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Fruit;

import java.util.List;
import java.util.Optional;

public interface FruitService {
    List<Fruit> findAll();

    Fruit save(Fruit fruit);

    Fruit getById(Long id);

    Fruit delete(Long id);

    List<Fruit> getByPriceAsc();

    List<Fruit> getByPriceDesc();

    List<Fruit> searchByName(String name);

}
