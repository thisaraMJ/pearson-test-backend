package com.pearson.crudappbackend.service;

import com.pearson.crudappbackend.exeption.CountryNotFoundException;
import com.pearson.crudappbackend.model.Country;
import com.pearson.crudappbackend.repo.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    private final CountryRepo countryRepo;

    @Autowired
    public CountryService(CountryRepo countryRepo) {
        this.countryRepo = countryRepo;
    }

    public List<Country> findAllCountries() {
        return countryRepo.findAll();
    }

    public Optional<Country> findCountryById(int id) {
        return countryRepo.findById(id);

    }

    public Country addCountry(Country country) {
        return countryRepo.save(country);
    }

    public Country updateCountry(Country country) {
        return countryRepo.save(country);
    }

    public void deleteCountry(int id) {
        countryRepo.deleteById(id);
    }


}
