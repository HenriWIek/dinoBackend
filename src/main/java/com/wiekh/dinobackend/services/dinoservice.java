package com.wiekh.dinobackend.services;

import com.wiekh.dinobackend.models.Dino;
import org.springframework.stereotype.Service;

@Service
public class dinoservice {

    Dino[] dinos = new Dino[] {
            new Dino(1L, "Rex", "Tyrannosaurus", 100, 1000),
            new Dino(2L, "Trike", "Triceratops", 80, 600),
            new Dino(3L, "Stego", "Stegosaurus", 70, 700)
    };


    public Dino[] getDinos() {
        return dinos;
    }


    public Dino getDinoById(Long id) {
        for (Dino dino : dinos) {
            if (dino.getId().equals(id)) {
                return dino;
            }
        }
        return null;
    }

    public Dino createDino(Dino dino) {
        return new Dino(dino.getId(), dino.getName(), dino.getSpecies(), dino.getAge(), dino.getWeight());
    }

    public Dino updateDino(Long id, Dino dino) {
        for (int i = 0; i < dinos.length; i++) {
            if (dinos[i].getId().equals(id)) {
                dinos[i] = dino;
                return dino;
            }
        }
        return null;
    }

    public void deleteDino(Long id) {
        for (int i = 0; i < dinos.length; i++) {
            if (dinos[i].getId().equals(id)) {
                dinos[i] = null;
            }
        }
    }

}

