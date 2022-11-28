package com.example.thikthp_module4.service.city;

import com.example.thikthp_module4.model.City;
import com.example.thikthp_module4.model.dto.CityDTO;
import com.example.thikthp_module4.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class CityServiceImpl implements CityService{

    @Autowired
    CityRepository cityRepository;

    @Override
    public Optional<City> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public City save(City city) {
        return cityRepository.save(city);
    }

    @Override
    public List<CityDTO> getAllCityDTO() {
        return cityRepository.getAllCityDTO();
    }

    @Override
    public Optional<CityDTO> getCityDTOById(Long id) {
        return cityRepository.getCityDTOById(id);
    }

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public City getById(Long id) {
        return cityRepository.getById(id);
    }

    @Override
    public void remove(Long id) {
        cityRepository.deleteById(id);
    }
}
