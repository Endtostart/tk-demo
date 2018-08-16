package tk.sample.tkdemo.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tk.sample.tkdemo.entity.Country;
import tk.sample.tkdemo.service.CountryService;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping
public class CountryController {
    @Resource
    CountryService countryService;

    @ResponseBody
    @RequestMapping("/findOne")
    public Country findOne() {
        return countryService.findOne();
    }

    @ResponseBody
    @RequestMapping("/selectAll")
    public List<Country> selectAll() {
        return countryService.findAll();
    }

    @ResponseBody
    @RequestMapping("/selectByPrimerKey")
    public Country selectByPrimerKey(Country country) {
            country = new Country();
            country.setId(1);
        return countryService.selectByPrimerKey(country);
    }

    @ResponseBody
    @RequestMapping("/insert")
    public int insert(Country country) {
            country = new Country();
            country.setId(3);
            country.setCountryname("wang");
            country.setCountrycode("99");
        return countryService.insert(country);
    }

    @ResponseBody
    @RequestMapping("/delete")
    public int delete(Country country) {
            country = new Country();
            country.setId(1);
            country.setCountryname("wang");
            country.setCountrycode("99");
        return countryService.delete(country);
    }


}
