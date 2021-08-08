package com.pearson.crudappbackend.controller;

import com.pearson.crudappbackend.model.Country;
import com.pearson.crudappbackend.service.CountryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Country>> getAllCountries(){
        List<Country> countries = countryService.findAllCountries();
        return new ResponseEntity<>(countries, HttpStatus.OK); //200
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Country> getCountryById(@PathVariable("id") int id){
        Country country = countryService.findCountryById(id);
        return new ResponseEntity<>(country, HttpStatus.OK); //200
    }

    @PostMapping("/add")
    public ResponseEntity<Country> addCountry(@RequestBody Country country){
        Country newCountry = countryService.addCountry(country);
        return new ResponseEntity<>(newCountry, HttpStatus.CREATED); // new object created
    }

    @PutMapping("/update")
    public ResponseEntity<Country> updateCountry(@RequestBody Country country){
        Country updatedCountry = countryService.updateCountry(country);
        return new ResponseEntity<>(updatedCountry, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCountry(@PathVariable("id") int id){
        countryService.deleteCountry(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
