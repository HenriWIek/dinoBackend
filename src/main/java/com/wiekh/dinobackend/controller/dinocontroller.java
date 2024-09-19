package com.wiekh.dinobackend.controller;

import com.wiekh.dinobackend.models.Dino;
import com.wiekh.dinobackend.services.dinoservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class dinocontroller {

    private static final Logger log = LoggerFactory.getLogger(dinocontroller.class);
    private final dinoservice dinoService;

    @Autowired
    public dinocontroller(dinoservice dinoService) {
        this.dinoService = dinoService;
    }

    @GetMapping("/dinos")
    public Dino[] getDinos() {
        return this.dinoService.getDinos();
    }

    @GetMapping("/dinos/{id}")
    public Dino getDinoById(@PathVariable Long id) {
        return this.dinoService.getDinoById(id);
    }

    @PostMapping("/dinos")
    public Dino createDino(@RequestBody Dino dino) {
        return this.dinoService.createDino(dino);
    }

    @PutMapping("/dinos/{id}")
    public Dino updateDino(@PathVariable Long id, @RequestBody Dino dino) {
        return this.dinoService.updateDino(id, dino);
    }

    @DeleteMapping("/dinos/{id}")
    public void deleteDino(@PathVariable Long id) {
        this.dinoService.deleteDino(id);
    }

}
