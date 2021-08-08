package com.pearson.crudappbackend.repo;

import com.pearson.crudappbackend.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CountryRepo extends JpaRepository<Country, Integer> {

    Optional<Country> findCountryById(int id);

    void deleteEmployeeById(int id);
}
