package tk.sample.tkdemo.entity;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "country")
public class Country {

    @Column(name = "id")
    private Integer id;
    /**
     * 名称
     */
    @Column(name = "countryname")
    private String countryname;

    /**
     * 代码
     */
    @Column(name = "countrycode")
    private String countrycode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }
}
