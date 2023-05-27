package com.example.demo.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

@Entity
public class Day {
    @Id
    @GeneratedValue(generator = "UUID")
    @org.hibernate.annotations.GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    private String datetime;
    private Long datetimeEpoch;
    private BigDecimal tempmax;
    private BigDecimal tempmin;
    private BigDecimal temp;
    private BigDecimal feelslikemax;
    private BigDecimal feelslikemin;
    private BigDecimal feelslike;
    private BigDecimal dew;
    private BigDecimal humidity;
    private BigDecimal precip;
    private BigDecimal precipprob;
    private BigDecimal precipcover;

    @ElementCollection
    private List<String> preciptype;

    private BigDecimal snow;
    private BigDecimal snowdepth;
    private BigDecimal windgust;
    private BigDecimal windspeed;
    private BigDecimal winddir;
    private BigDecimal pressure;
    private BigDecimal cloudcover;
    private BigDecimal visibility;
    private BigDecimal solarradiation;
    private BigDecimal solarenergy;
    private BigDecimal uvindex;
    private String sunrise;
    private Long sunriseEpoch;
    private String sunset;
    private Long sunsetEpoch;
    private BigDecimal moonphase;
    private String conditions;
    private String description;
    private String icon;

    @ElementCollection
    private List<String> stations;

    private String source;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="city_id")
    private City city;

    public Day() {
    }

    public Day(String id, String datetime, Long datetimeEpoch, BigDecimal tempmax, BigDecimal tempmin, BigDecimal temp, BigDecimal feelslikemax, BigDecimal feelslikemin, BigDecimal feelslike, BigDecimal dew, BigDecimal humidity, BigDecimal precip, BigDecimal precipprob, BigDecimal precipcover, List<String> preciptype, BigDecimal snow, BigDecimal snowdepth, BigDecimal windgust, BigDecimal windspeed, BigDecimal winddir, BigDecimal pressure, BigDecimal cloudcover, BigDecimal visibility, BigDecimal solarradiation, BigDecimal solarenergy, BigDecimal uvindex, String sunrise, Long sunriseEpoch, String sunset, Long sunsetEpoch, BigDecimal moonphase, String conditions, String description, String icon, List<String> stations, String source, City city) {
        this.id = id;
        this.datetime = datetime;
        this.datetimeEpoch = datetimeEpoch;
        this.tempmax = tempmax;
        this.tempmin = tempmin;
        this.temp = temp;
        this.feelslikemax = feelslikemax;
        this.feelslikemin = feelslikemin;
        this.feelslike = feelslike;
        this.dew = dew;
        this.humidity = humidity;
        this.precip = precip;
        this.precipprob = precipprob;
        this.precipcover = precipcover;
        this.preciptype = preciptype;
        this.snow = snow;
        this.snowdepth = snowdepth;
        this.windgust = windgust;
        this.windspeed = windspeed;
        this.winddir = winddir;
        this.pressure = pressure;
        this.cloudcover = cloudcover;
        this.visibility = visibility;
        this.solarradiation = solarradiation;
        this.solarenergy = solarenergy;
        this.uvindex = uvindex;
        this.sunrise = sunrise;
        this.sunriseEpoch = sunriseEpoch;
        this.sunset = sunset;
        this.sunsetEpoch = sunsetEpoch;
        this.moonphase = moonphase;
        this.conditions = conditions;
        this.description = description;
        this.icon = icon;
        this.stations = stations;
        this.source = source;
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public Long getDatetimeEpoch() {
        return datetimeEpoch;
    }

    public void setDatetimeEpoch(Long datetimeEpoch) {
        this.datetimeEpoch = datetimeEpoch;
    }

    public BigDecimal getTempmax() {
        return tempmax;
    }

    public void setTempmax(BigDecimal tempmax) {
        this.tempmax = tempmax;
    }

    public BigDecimal getTempmin() {
        return tempmin;
    }

    public void setTempmin(BigDecimal tempmin) {
        this.tempmin = tempmin;
    }

    public BigDecimal getTemp() {
        return temp;
    }

    public void setTemp(BigDecimal temp) {
        this.temp = temp;
    }

    public BigDecimal getFeelslikemax() {
        return feelslikemax;
    }

    public void setFeelslikemax(BigDecimal feelslikemax) {
        this.feelslikemax = feelslikemax;
    }

    public BigDecimal getFeelslikemin() {
        return feelslikemin;
    }

    public void setFeelslikemin(BigDecimal feelslikemin) {
        this.feelslikemin = feelslikemin;
    }

    public BigDecimal getFeelslike() {
        return feelslike;
    }

    public void setFeelslike(BigDecimal feelslike) {
        this.feelslike = feelslike;
    }

    public BigDecimal getDew() {
        return dew;
    }

    public void setDew(BigDecimal dew) {
        this.dew = dew;
    }

    public BigDecimal getHumidity() {
        return humidity;
    }

    public void setHumidity(BigDecimal humidity) {
        this.humidity = humidity;
    }

    public BigDecimal getPrecip() {
        return precip;
    }

    public void setPrecip(BigDecimal precip) {
        this.precip = precip;
    }

    public BigDecimal getPrecipprob() {
        return precipprob;
    }

    public void setPrecipprob(BigDecimal precipprob) {
        this.precipprob = precipprob;
    }

    public BigDecimal getPrecipcover() {
        return precipcover;
    }

    public void setPrecipcover(BigDecimal precipcover) {
        this.precipcover = precipcover;
    }

    public List<String> getPreciptype() {
        return preciptype;
    }

    public void setPreciptype(List<String> preciptype) {
        this.preciptype = preciptype;
    }

    public BigDecimal getSnow() {
        return snow;
    }

    public void setSnow(BigDecimal snow) {
        this.snow = snow;
    }

    public BigDecimal getSnowdepth() {
        return snowdepth;
    }

    public void setSnowdepth(BigDecimal snowdepth) {
        this.snowdepth = snowdepth;
    }

    public BigDecimal getWindgust() {
        return windgust;
    }

    public void setWindgust(BigDecimal windgust) {
        this.windgust = windgust;
    }

    public BigDecimal getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(BigDecimal windspeed) {
        this.windspeed = windspeed;
    }

    public BigDecimal getWinddir() {
        return winddir;
    }

    public void setWinddir(BigDecimal winddir) {
        this.winddir = winddir;
    }

    public BigDecimal getPressure() {
        return pressure;
    }

    public void setPressure(BigDecimal pressure) {
        this.pressure = pressure;
    }

    public BigDecimal getCloudcover() {
        return cloudcover;
    }

    public void setCloudcover(BigDecimal cloudcover) {
        this.cloudcover = cloudcover;
    }

    public BigDecimal getVisibility() {
        return visibility;
    }

    public void setVisibility(BigDecimal visibility) {
        this.visibility = visibility;
    }

    public BigDecimal getSolarradiation() {
        return solarradiation;
    }

    public void setSolarradiation(BigDecimal solarradiation) {
        this.solarradiation = solarradiation;
    }

    public BigDecimal getSolarenergy() {
        return solarenergy;
    }

    public void setSolarenergy(BigDecimal solarenergy) {
        this.solarenergy = solarenergy;
    }

    public BigDecimal getUvindex() {
        return uvindex;
    }

    public void setUvindex(BigDecimal uvindex) {
        this.uvindex = uvindex;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public Long getSunriseEpoch() {
        return sunriseEpoch;
    }

    public void setSunriseEpoch(Long sunriseEpoch) {
        this.sunriseEpoch = sunriseEpoch;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public Long getSunsetEpoch() {
        return sunsetEpoch;
    }

    public void setSunsetEpoch(Long sunsetEpoch) {
        this.sunsetEpoch = sunsetEpoch;
    }

    public BigDecimal getMoonphase() {
        return moonphase;
    }

    public void setMoonphase(BigDecimal moonphase) {
        this.moonphase = moonphase;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public List<String> getStations() {
        return stations;
    }

    public void setStations(List<String> stations) {
        this.stations = stations;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Day day = (Day) o;
        return Objects.equals(id, day.id) && Objects.equals(datetime, day.datetime) && Objects.equals(datetimeEpoch, day.datetimeEpoch) && Objects.equals(tempmax, day.tempmax) && Objects.equals(tempmin, day.tempmin) && Objects.equals(temp, day.temp) && Objects.equals(feelslikemax, day.feelslikemax) && Objects.equals(feelslikemin, day.feelslikemin) && Objects.equals(feelslike, day.feelslike) && Objects.equals(dew, day.dew) && Objects.equals(humidity, day.humidity) && Objects.equals(precip, day.precip) && Objects.equals(precipprob, day.precipprob) && Objects.equals(precipcover, day.precipcover) && Objects.equals(preciptype, day.preciptype) && Objects.equals(snow, day.snow) && Objects.equals(snowdepth, day.snowdepth) && Objects.equals(windgust, day.windgust) && Objects.equals(windspeed, day.windspeed) && Objects.equals(winddir, day.winddir) && Objects.equals(pressure, day.pressure) && Objects.equals(cloudcover, day.cloudcover) && Objects.equals(visibility, day.visibility) && Objects.equals(solarradiation, day.solarradiation) && Objects.equals(solarenergy, day.solarenergy) && Objects.equals(uvindex, day.uvindex) && Objects.equals(sunrise, day.sunrise) && Objects.equals(sunriseEpoch, day.sunriseEpoch) && Objects.equals(sunset, day.sunset) && Objects.equals(sunsetEpoch, day.sunsetEpoch) && Objects.equals(moonphase, day.moonphase) && Objects.equals(conditions, day.conditions) && Objects.equals(description, day.description) && Objects.equals(icon, day.icon) && Objects.equals(stations, day.stations) && Objects.equals(source, day.source) && Objects.equals(city, day.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, datetime, datetimeEpoch, tempmax, tempmin, temp, feelslikemax, feelslikemin, feelslike, dew, humidity, precip, precipprob, precipcover, preciptype, snow, snowdepth, windgust, windspeed, winddir, pressure, cloudcover, visibility, solarradiation, solarenergy, uvindex, sunrise, sunriseEpoch, sunset, sunsetEpoch, moonphase, conditions, description, icon, stations, source, city);
    }

    @Override
    public String toString() {
        return "Day{" +
                "id='" + id + '\'' +
                ", datetime='" + datetime + '\'' +
                ", datetimeEpoch=" + datetimeEpoch +
                ", tempmax=" + tempmax +
                ", tempmin=" + tempmin +
                ", temp=" + temp +
                ", feelslikemax=" + feelslikemax +
                ", feelslikemin=" + feelslikemin +
                ", feelslike=" + feelslike +
                ", dew=" + dew +
                ", humidity=" + humidity +
                ", precip=" + precip +
                ", precipprob=" + precipprob +
                ", precipcover=" + precipcover +
                ", preciptype=" + preciptype +
                ", snow=" + snow +
                ", snowdepth=" + snowdepth +
                ", windgust=" + windgust +
                ", windspeed=" + windspeed +
                ", winddir=" + winddir +
                ", pressure=" + pressure +
                ", cloudcover=" + cloudcover +
                ", visibility=" + visibility +
                ", solarradiation=" + solarradiation +
                ", solarenergy=" + solarenergy +
                ", uvindex=" + uvindex +
                ", sunrise='" + sunrise + '\'' +
                ", sunriseEpoch=" + sunriseEpoch +
                ", sunset='" + sunset + '\'' +
                ", sunsetEpoch=" + sunsetEpoch +
                ", moonphase=" + moonphase +
                ", conditions='" + conditions + '\'' +
                ", description='" + description + '\'' +
                ", icon='" + icon + '\'' +
                ", stations=" + stations +
                ", source='" + source + '\'' +
                ", city=" + city +
                '}';
    }
}

