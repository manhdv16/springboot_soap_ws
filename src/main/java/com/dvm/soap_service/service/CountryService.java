package com.dvm.soap_service.service;

import com.dvm.soap_service.dto.CountryInfo;
import com.dvm.soap_service.entity.Country;

public interface CountryService {
    Country findById(int id);
    Country findByName(String name);
    void save(CountryInfo countryInfo);
    void delete(int id);
}
