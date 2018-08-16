package tk.sample.tkdemo.service;

import tk.sample.tkdemo.entity.Country;

import java.util.List;

public interface CountryService {
    Country findOne();

    List<Country> findAll();

    int insert(Country country);

    int delete(Country country);

    Country selectByPrimerKey(Country country);

    int deleteByPrimerKey(Country country);
}
