package com.wiekh.dinobackend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Dino {

    @Id
    private Long id;

    private String name;

    private String species;

    private long age;

    private long weight;

    public Dino() {
    }

    public Dino(Long id, String name, String species, long age, long weight) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public long getAge() {
        return age;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public long getWeight() {
        return weight;
    }



}