package com.example.demo.model


import javax.persistence.*
import org.hibernate.annotations.GenericGenerator

@Entity
data class City(
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    val id: String?= null,
    val queryCost:Int?= null,
    val latitude:Double?= null,
    val longitude:Double?= null,
    val resolvedAddress:String?= null,
    val address:String?= null,
    val timezone:String?= null,
    val tzoffset:Double?= null,

    @OneToMany(mappedBy = "city", fetch = FetchType.LAZY)
    val days: List<Day>?= null,

    @OneToOne(mappedBy = "city", fetch = FetchType.LAZY)
    val currentConditions: CurrentCondition?= null,

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
        if (currentConditions != other.currentConditions) return false

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
        result = 31 * result + currentConditions.hashCode()
        return result
    }

}
