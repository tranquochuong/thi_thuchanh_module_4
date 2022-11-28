package com.example.thikthp_module4.repository;

import com.example.thikthp_module4.model.Country;
import com.example.thikthp_module4.model.dto.CountryDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, Long> {
    @Query("SELECT NEW com.example.thikthp_module4.model.dto.CountryDTO (" +
            "c.id, " +
            "c.nameCountry )" +
            "FROM Country c ")
    List<CountryDTO> getAllCountryDTO();
}
