package com.example.thikthp_module4.model;

import com.example.thikthp_module4.model.dto.CityDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
@Entity
@Table(name = "city")
public class City extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cityName;

    private Double area;

    private Long population;

    private Long gdp;

    private String description;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    public CityDTO toCityDTO() {
        return new CityDTO()
                .setId(id.toString())
                .setCityName(cityName)
                .setArea(Double.valueOf(String.valueOf(area)))
                .setPopulation(population.toString())
                .setGdp(String.valueOf(gdp))
                .setDescription(description)
                .setCountry(country.toCountryDTO());
    }
}
