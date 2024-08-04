package com.dvm.soap_service.repository;

import com.dvm.soap_service.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
    Country findById(int id);
    Country findByName(String name);
}
