package com.example.demo.model;

import org.hibernate.annotations.GenericGenerator;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import javax.persistence.*;

@Entity
public class CurrentCondition {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    private String datetime;
    private Long datetimeEpoch;
    private BigDecimal temp;
    private BigDecimal feelslike;
    private BigDecimal humidity;
    private BigDecimal dew;
    private BigDecimal precip;
    private BigDecimal precipprob;
    private BigDecimal snow;
    private BigDecimal snowdepth;
    private BigDecimal preciptype;
    private BigDecimal windgust;
    private BigDecimal windspeed;
    private BigDecimal winddir;
    private BigDecimal pressure;
    private BigDecimal visibility;
    private BigDecimal cloudcover;
    private BigDecimal solarradiation;
    private BigDecimal solarenergy;
    private BigDecimal uvindex;
    private String conditions;
    private String icon;

    @ElementCollection
    private List<String> stations;

    private String source;
    private String sunrise;
    private Long sunriseEpoch;
    private String sunset;
    private Long sunsetEpoch;
    private BigDecimal moonphase;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "city_id", referencedColumnName = "id")
    private City city;

    // Constructors, getters, and setters

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrentCondition other = (CurrentCondition) o;
        return Objects.equals(id, other.id)
                && Objects.equals(datetime, other.datetime)
                && Objects.equals(datetimeEpoch, other.datetimeEpoch)
                && Objects.equals(temp, other.temp)
                && Objects.equals(feelslike, other.feelslike)
                && Objects.equals(humidity, other.humidity)
                && Objects.equals(dew, other.dew)
                && Objects.equals(precip, other.precip)
                && Objects.equals(precipprob, other.precipprob)
                && Objects.equals(snow, other.snow)
                && Objects.equals(snowdepth, other.snowdepth)
                && Objects.equals(preciptype, other.preciptype)
                && Objects.equals(windgust, other.windgust)
                && Objects.equals(windspeed, other.windspeed)
                && Objects.equals(winddir, other.winddir)
                && Objects.equals(pressure, other.pressure)
                && Objects.equals(visibility, other.visibility)
                && Objects.equals(cloudcover, other.cloudcover)
                && Objects.equals(solarradiation, other.solarradiation)
                && Objects.equals(solarenergy, other.solarenergy)
                && Objects.equals(uvindex, other.uvindex)
                && Objects.equals(conditions, other.conditions)
                && Objects.equals(icon, other.icon)
                && Objects.equals(stations, other.stations)
                && Objects.equals(source, other.source)
                && Objects.equals(sunrise, other.sunrise)
                && Objects.equals(sunriseEpoch, other.sunriseEpoch)
                && Objects.equals(sunset, other.sunset)
                && Objects.equals(sunsetEpoch, other.sunsetEpoch)
                && Objects.equals(moonphase, other.moonphase)
                && Objects.equals(city, other.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, datetime, datetimeEpoch, temp, feelslike, humidity, dew, precip,
                precipprob, snow, snowdepth, preciptype, windgust, windspeed, winddir, pressure,
                visibility, cloudcover, solarradiation, solarenergy, uvindex, conditions, icon,
                stations, source, sunrise, sunriseEpoch, sunset, sunsetEpoch, moonphase, city);
    }
}