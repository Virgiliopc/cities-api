package com.github.virgiliopc.citiesapi.repository;

import com.github.virgiliopc.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
