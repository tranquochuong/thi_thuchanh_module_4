package com.example.thikthp_module4.model.dto;

import com.example.thikthp_module4.model.City;
import com.example.thikthp_module4.model.Country;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class CityDTO {

    private String id;

    @NotBlank(message = "Vui lòng nhập tên thành phố.")
    @Length(min = 3, max = 45, message = "Thấp nhất là 3 ký tự, nhiều nhất 45 ký tự")
    private String cityName;

    @NotBlank(message = "Vui lòng nhập diện tích")
    @Pattern(regexp = "^[0-9]+$", message = "Diện tích phải là số.")
    @Min( value = 1000,message = "Diện tích thấp nhất là 1000m2")
    private Double area;

    @NotBlank(message = "Dân số không được để trống!")
    @Pattern(regexp = "^[0-9]+$", message = "Dân số phải là số.")
    @Min( value = 1000,message = "Dân số thấp nhất là 1000 người")
    private String population;

    @NotBlank(message = "GDP không được để trống!")
    @Pattern(regexp = "^[0-9]+$", message = "GDP phải là số.")
    @Min(value = 1,message = "GDP thấp nhất là 1" )
    private String gdp;

    @NotBlank(message = "Nhập mô tả thành phố.")
    @Length(min = 20, max = 1000, message = "Mô tả thấp nhất là 20 ký tự, nhiều nhất là 1000 ký tự")
    private String description;

    private CountryDTO country;

    public CityDTO(Long id, String cityName, Double area, Long population, Long gdp, String description, Country country) {
        this.id = id.toString();
        this.cityName = cityName;
        this.area = Double.valueOf(area.toString());
        this.population = population.toString();
        this.gdp = gdp.toString();
        this.description = description;
        this.country = country.toCountryDTO();
    }

    public City toCity() {
        return new City()
                .setId(Long.parseLong(id))
                .setCityName(cityName)
                .setArea(Double.parseDouble(String.valueOf(area)))
                .setPopulation(Long.parseLong(population))
                .setGdp(Long.parseLong(gdp))
                .setDescription(description)
                .setCountry(country.toCountry());
    }
}
