package com.example.demo.model


import org.hibernate.annotations.GenericGenerator
import java.math.BigDecimal
import java.time.LocalTime
import javax.persistence.*

@Entity
data class CurrentCondition(
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    val id: String?,

    val datetime:LocalTime?,
    val datetimeEpoch:Long?,
    val temp:BigDecimal?,
    val feelslike:BigDecimal?,
    val humidity:BigDecimal?,
    val dew:BigDecimal?,
    val precip:BigDecimal?,
    val precipprob:BigDecimal?,
    val snow:BigDecimal?,
    val snowdepth:BigDecimal?,
    val preciptype:BigDecimal?,
    val windgust:BigDecimal?,
    val windspeed:BigDecimal?,
    val winddir:BigDecimal?,
    val pressure:BigDecimal?,
    val visibility:BigDecimal?,
    val cloudcover:BigDecimal?,
    val solarradiation:BigDecimal?,
    val solarenergy:BigDecimal?,
    val uvindex:BigDecimal?,
    val conditions:String?,
    val icon:String?,

    @OneToMany(mappedBy = "currentCondition", fetch = FetchType.LAZY)
    val stations: Set<Station>,

    val source:String?,
    val sunrise:String?,
    val sunriseEpoch:Long?,
    val sunset:String?,
    val sunsetEpoch:Long?,
    val moonphase:BigDecimal?,

    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "city_id", referencedColumnName = "id")
    val city: City,
){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CurrentCondition

        if (id != other.id) return false
        if (datetime != other.datetime) return false
        if (datetimeEpoch != other.datetimeEpoch) return false
        if (temp != other.temp) return false
        if (feelslike != other.feelslike) return false
        if (humidity != other.humidity) return false
        if (dew != other.dew) return false
        if (precip != other.precip) return false
        if (precipprob != other.precipprob) return false
        if (snow != other.snow) return false
        if (snowdepth != other.snowdepth) return false
        if (preciptype != other.preciptype) return false
        if (windgust != other.windgust) return false
        if (windspeed != other.windspeed) return false
        if (winddir != other.winddir) return false
        if (pressure != other.pressure) return false
        if (visibility != other.visibility) return false
        if (cloudcover != other.cloudcover) return false
        if (solarradiation != other.solarradiation) return false
        if (solarenergy != other.solarenergy) return false
        if (uvindex != other.uvindex) return false
        if (conditions != other.conditions) return false
        if (icon != other.icon) return false
        if (stations != other.stations) return false
        if (source != other.source) return false
        if (sunrise != other.sunrise) return false
        if (sunriseEpoch != other.sunriseEpoch) return false
        if (sunset != other.sunset) return false
        if (sunsetEpoch != other.sunsetEpoch) return false
        if (moonphase != other.moonphase) return false
        if (city != other.city) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + (datetime?.hashCode() ?: 0)
        result = 31 * result + (datetimeEpoch?.hashCode() ?: 0)
        result = 31 * result + (temp?.hashCode() ?: 0)
        result = 31 * result + (feelslike?.hashCode() ?: 0)
        result = 31 * result + (humidity?.hashCode() ?: 0)
        result = 31 * result + (dew?.hashCode() ?: 0)
        result = 31 * result + (precip?.hashCode() ?: 0)
        result = 31 * result + (precipprob?.hashCode() ?: 0)
        result = 31 * result + (snow?.hashCode() ?: 0)
        result = 31 * result + (snowdepth?.hashCode() ?: 0)
        result = 31 * result + (preciptype?.hashCode() ?: 0)
        result = 31 * result + (windgust?.hashCode() ?: 0)
        result = 31 * result + (windspeed?.hashCode() ?: 0)
        result = 31 * result + (winddir?.hashCode() ?: 0)
        result = 31 * result + (pressure?.hashCode() ?: 0)
        result = 31 * result + (visibility?.hashCode() ?: 0)
        result = 31 * result + (cloudcover?.hashCode() ?: 0)
        result = 31 * result + (solarradiation?.hashCode() ?: 0)
        result = 31 * result + (solarenergy?.hashCode() ?: 0)
        result = 31 * result + (uvindex?.hashCode() ?: 0)
        result = 31 * result + (conditions?.hashCode() ?: 0)
        result = 31 * result + (icon?.hashCode() ?: 0)
        result = 31 * result + stations.hashCode()
        result = 31 * result + (source?.hashCode() ?: 0)
        result = 31 * result + (sunrise?.hashCode() ?: 0)
        result = 31 * result + (sunriseEpoch?.hashCode() ?: 0)
        result = 31 * result + (sunset?.hashCode() ?: 0)
        result = 31 * result + (sunsetEpoch?.hashCode() ?: 0)
        result = 31 * result + (moonphase?.hashCode() ?: 0)
        result = 31 * result + city.hashCode()
        return result
    }
}
