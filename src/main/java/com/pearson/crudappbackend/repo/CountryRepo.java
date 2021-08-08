package com.pearson.crudappbackend.repo;

import com.pearson.crudappbackend.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CountryRepo extends JpaRepository<Country, Integer> { }
