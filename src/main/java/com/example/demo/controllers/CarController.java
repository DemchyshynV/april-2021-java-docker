package com.example.demo.controllers;

import com.example.demo.dao.CarRepository;
import com.example.demo.models.Car;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/cars")
public class CarController {
    private final CarRepository carRepository;

    @PostMapping
    public Car create(@RequestBody Car car) {
        return carRepository.save(car);
    }

    @GetMapping
    public List<Car> getAll() {
        return carRepository.findAll();
    }
}
