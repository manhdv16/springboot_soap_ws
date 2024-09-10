package com.dvm.soap_service.service.impl;

import com.dvm.soap_service.dto.CountryInfo;
import com.dvm.soap_service.entity.Country;
import com.dvm.soap_service.repository.CountryRepository;
import com.dvm.soap_service.service.CountryService;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public Country findById(int id) {
        return countryRepository.findById(id);
    }

    @Override
    public Country findByName(String name) {
        return countryRepository.findByName(name);
    }

    @Override
    public void save(CountryInfo countryInfo) {
        Country country = new Country();
        country.setName(countryInfo.getName());
        country.setCapital(countryInfo.getCapital());
        country.setCurrency(countryInfo.getCurrency());
        countryRepository.save(country);
    }

    @Override
    public void delete(int id) {
        countryRepository.deleteById(id);
    }

    @Override
    public void update(CountryInfo countryInfo) {
        Country country = countryRepository.findById(countryInfo.getId());
        country.setName(countryInfo.getName());
        country.setCapital(countryInfo.getCapital());
        country.setCurrency(countryInfo.getCurrency());
        countryRepository.save(country);
    }
}
