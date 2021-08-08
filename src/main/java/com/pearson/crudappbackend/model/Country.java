package com.pearson.crudappbackend.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Country implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private int id;
    private String name;
    private int countryCode;
    private int landArea;
    private int population;

    public Country() {}

    public Country(int id, String name, int countryCode, int landArea, int population) {
        this.id = id;
        this.name = name;
        this.countryCode = countryCode;
        this.landArea = landArea;
        this.population = population;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public int getLandArea() {
        return landArea;
    }

    public void setLandArea(int landArea) {
        this.landArea = landArea;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", landArea='" + landArea + '\'' +
                ", population='" + population + '\'' +
                '}';
    }
}
