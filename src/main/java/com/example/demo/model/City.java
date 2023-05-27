package com.example.demo.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class City {
    @Id
    @GeneratedValue(generator = "UUID")
    @org.hibernate.annotations.GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    private Integer queryCost;
    private Double latitude;
    private Double longitude;
    private String resolvedAddress;
    private String address;
    private String timezone;
    private Double tzoffset;

    @OneToMany(mappedBy = "city", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Day> days;

    @OneToOne(mappedBy = "city", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private CurrentCondition currentConditions;

    public City() {
    }

    public City(String id, Integer queryCost, Double latitude, Double longitude, String resolvedAddress, String address, String timezone, Double tzoffset, List<Day> days, CurrentCondition currentConditions) {
        this.id = id;
        this.queryCost = queryCost;
        this.latitude = latitude;
        this.longitude = longitude;
        this.resolvedAddress = resolvedAddress;
        this.address = address;
        this.timezone = timezone;
        this.tzoffset = tzoffset;
        this.days = days;
        this.currentConditions = currentConditions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getQueryCost() {
        return queryCost;
    }

    public void setQueryCost(Integer queryCost) {
        this.queryCost = queryCost;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getResolvedAddress() {
        return resolvedAddress;
    }

    public void setResolvedAddress(String resolvedAddress) {
        this.resolvedAddress = resolvedAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Double getTzoffset() {
        return tzoffset;
    }

    public void setTzoffset(Double tzoffset) {
        this.tzoffset = tzoffset;
    }

    public List<Day> getDays() {
        return days;
    }

    public void setDays(List<Day> days) {
        this.days = days;
    }

    public CurrentCondition getCurrentConditions() {
        return currentConditions;
    }

    public void setCurrentConditions(CurrentCondition currentConditions) {
        this.currentConditions = currentConditions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City city = (City) o;
        return Objects.equals(getId(), city.getId()) &&
                Objects.equals(getQueryCost(), city.getQueryCost()) &&
                Objects.equals(getLatitude(), city.getLatitude()) &&
                Objects.equals(getLongitude(), city.getLongitude()) &&
                Objects.equals(getResolvedAddress(), city.getResolvedAddress()) &&
                Objects.equals(getAddress(), city.getAddress()) &&
                Objects.equals(getTimezone(), city.getTimezone()) &&
                Objects.equals(getTzoffset(), city.getTzoffset()) &&
                Objects.equals(getDays(), city.getDays()) &&
                Objects.equals(getCurrentConditions(), city.getCurrentConditions());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getQueryCost(), getLatitude(), getLongitude(), getResolvedAddress(), getAddress(), getTimezone(), getTzoffset(), getDays(), getCurrentConditions());
    }
}
