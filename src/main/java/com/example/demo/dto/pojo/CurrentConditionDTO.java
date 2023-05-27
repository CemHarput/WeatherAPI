package com.example.demo.dto.pojo;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class CurrentConditionDTO {
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
    private List<String> stations;
    private String source;
    private String sunrise;
    private Long sunriseEpoch;
    private String sunset;
    private Long sunsetEpoch;
    private BigDecimal moonphase;

    // Getters and Setters

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

    public BigDecimal getTemp() {
        return temp;
    }

    public void setTemp(BigDecimal temp) {
        this.temp = temp;
    }

    public BigDecimal getFeelslike() {
        return feelslike;
    }

    public void setFeelslike(BigDecimal feelslike) {
        this.feelslike = feelslike;
    }

    public BigDecimal getHumidity() {
        return humidity;
    }

    public void setHumidity(BigDecimal humidity) {
        this.humidity = humidity;
    }

    public BigDecimal getDew() {
        return dew;
    }

    public void setDew(BigDecimal dew) {
        this.dew = dew;
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

    public BigDecimal getPreciptype() {
        return preciptype;
    }

    public void setPreciptype(BigDecimal preciptype) {
        this.preciptype = preciptype;
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

    public BigDecimal getVisibility() {
        return visibility;
    }

    public void setVisibility(BigDecimal visibility) {
        this.visibility = visibility;
    }

    public BigDecimal getCloudcover() {
        return cloudcover;
    }

    public void setCloudcover(BigDecimal cloudcover) {
        this.cloudcover = cloudcover;
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

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
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
}

