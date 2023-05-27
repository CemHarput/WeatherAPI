package com.example.demo.dto.pojo;

import com.example.demo.model.CurrentCondition;
import com.example.demo.model.Day;

import java.util.List;

public class CityDTO {
    private String id;
    private Integer queryCost;
    private Double latitude;
    private Double longitude;
    private String resolvedAddress;
    private String address;
    private String timezone;
    private Double tzoffset;
    private List<Day> days;
    private CurrentCondition currentConditions;

    public CityDTO() {
    }

    public CityDTO(String id, Integer queryCost, Double latitude, Double longitude, String resolvedAddress, String address, String timezone, Double tzoffset, List<Day> days, CurrentCondition currentConditions) {
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
}
