package tk.sample.tkdemo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import tk.sample.tkdemo.entity.Country;

@Mapper
public interface CountryMapper extends tk.mybatis.mapper.common.Mapper<Country> {
    @Select("select * from country limit 1")
    Country findOne();
}
