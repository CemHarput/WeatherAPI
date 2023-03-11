package com.example.demo.model


import javax.persistence.*
import org.hibernate.annotations.GenericGenerator

@Entity
data class City(
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    val id: String?,
    val queryCost:Int?,
    val latitude:Long?,
    val longitude:Long?,
    val resolvedAddress:String?,
    val address:String?,
    val timezone:String?,
    val tzoffset:Long?,

    @OneToMany(mappedBy = "city", fetch = FetchType.LAZY)
    val days: List<Day>,

    @OneToOne(mappedBy = "city", fetch = FetchType.LAZY)
    val station: Station,

    @OneToOne(mappedBy = "city", fetch = FetchType.LAZY)
    val currentCondition: CurrentCondition,

){
       override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as City

        if (id != other.id) return false
        if (queryCost != other.queryCost) return false
        if (latitude != other.latitude) return false
        if (longitude != other.longitude) return false
        if (resolvedAddress != other.resolvedAddress) return false
        if (address != other.address) return false
        if (timezone != other.timezone) return false
        if (tzoffset != other.tzoffset) return false
        if (days != other.days) return false
        if (station != other.station) return false
        if (currentCondition != other.currentCondition) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + (queryCost ?: 0)
        result = 31 * result + (latitude?.hashCode() ?: 0)
        result = 31 * result + (longitude?.hashCode() ?: 0)
        result = 31 * result + (resolvedAddress?.hashCode() ?: 0)
        result = 31 * result + (address?.hashCode() ?: 0)
        result = 31 * result + (timezone?.hashCode() ?: 0)
        result = 31 * result + (tzoffset?.hashCode() ?: 0)
        result = 31 * result + days.hashCode()
        result = 31 * result + station.hashCode()
        result = 31 * result + currentCondition.hashCode()
        return result
    }

}
