package com.example.demo.dto.pojo;

import java.math.BigDecimal;
import java.util.List;

public class DayDTO {
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
    private List<String> stations;
    private String source;
    private String cityName;

    public DayDTO() {
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

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
