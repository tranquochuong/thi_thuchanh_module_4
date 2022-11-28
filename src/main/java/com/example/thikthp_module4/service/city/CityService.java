package com.example.thikthp_module4.service.city;

import com.example.thikthp_module4.model.City;
import com.example.thikthp_module4.model.dto.CityDTO;
import com.example.thikthp_module4.service.IGeneralService;

import java.util.List;
import java.util.Optional;

public interface CityService extends IGeneralService<City> {
    List<CityDTO> getAllCityDTO();
    Optional<CityDTO> getCityDTOById(Long id);
}
