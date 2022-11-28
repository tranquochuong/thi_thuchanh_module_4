package com.example.thikthp_module4.service.country;

import com.example.thikthp_module4.model.Country;
import com.example.thikthp_module4.model.dto.CountryDTO;
import com.example.thikthp_module4.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CountryServiceImpl implements CountryService{

    @Autowired
    CountryRepository countryRepository;


    @Override
    public Optional<Country> findById(Long id) {
        return countryRepository.findById(id);
    }


    @Override
    public Country save(Country country) {
        return null;
    }

    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public Country getById(Long id) {
        return countryRepository.getById(id);
    }

    @Override
    public List<CountryDTO> getAllCountryDTO() {
        return countryRepository.getAllCountryDTO();
    }

    @Override
    public void remove(Long id) {
        countryRepository.deleteById(id);
    }
}
