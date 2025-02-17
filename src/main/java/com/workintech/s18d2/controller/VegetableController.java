package com.workintech.s18d2.controller;


import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.entity.Vegetable;
import com.workintech.s18d2.services.VegetableService;
import jakarta.validation.constraints.Min;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/vegetables")
public class VegetableController {

    private final VegetableService vegetableService;

    public VegetableController(VegetableService vegetableService) {
        this.vegetableService = vegetableService;
    }

    @GetMapping
    public List<Vegetable> getByPriceAsc(){
        return vegetableService.getByPriceAsc();}

    @GetMapping("{id}")
    public Vegetable getById(@PathVariable @Min(1) Long id){
        return vegetableService.getById(id);
    }

    @GetMapping("/desc")
    public List<Vegetable> getByPriceDesc(){
        return vegetableService.getByPriceDesc();
    }

    @PostMapping
    public  Vegetable save(@RequestBody Vegetable vegetable){
        return vegetableService.save(vegetable);
    }
    @PostMapping("/{name}")
    public List<Vegetable> searchByName(@PathVariable("name") String name) {
        return vegetableService.searchByName(name);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable @Min(1) Long id){
        vegetableService.delete(id);
    }
}
