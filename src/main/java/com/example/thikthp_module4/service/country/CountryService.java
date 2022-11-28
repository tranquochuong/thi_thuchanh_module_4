package com.example.thikthp_module4.service.country;

import com.example.thikthp_module4.model.Country;
import com.example.thikthp_module4.model.dto.CountryDTO;
import com.example.thikthp_module4.service.IGeneralService;

import java.util.List;


public interface CountryService extends IGeneralService<Country> {
    List<CountryDTO> getAllCountryDTO();
}
