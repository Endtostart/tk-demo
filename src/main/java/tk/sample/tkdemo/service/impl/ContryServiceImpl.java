package tk.sample.tkdemo.service.impl;

import org.springframework.stereotype.Service;
import tk.sample.tkdemo.entity.Country;
import tk.sample.tkdemo.mapper.CountryMapper;
import tk.sample.tkdemo.service.CountryService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ContryServiceImpl implements CountryService {
    @Resource
    CountryMapper countryMapper;

    @Override
    public Country findOne() {

        return countryMapper.findOne();
    }

    @Override
    public List<Country> findAll() {
        return countryMapper.selectAll();
    }

    @Override
    public int insert(Country country) {
        return countryMapper.insert(country);
    }

    @Override
    public int delete(Country country) {
        return countryMapper.delete(country);
    }

    @Override
    public Country selectByPrimerKey(Country country) {
        return countryMapper.selectByPrimaryKey(country);
    }

    @Override
    public int deleteByPrimerKey(Country country) {
        return countryMapper.deleteByPrimaryKey(country);
    }


}
