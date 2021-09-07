package com.github.virgiliopc.citiesapi;

import com.github.virgiliopc.citiesapi.countries.Country;
import com.github.virgiliopc.citiesapi.repository.CountryRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    private CountryRepository repository;

    @GetMapping
    public List<Country> countries() {
        return repository.findAll();:
    }
}
