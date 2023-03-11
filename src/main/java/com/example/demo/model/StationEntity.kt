package com.example.demo.model


import org.hibernate.annotations.GenericGenerator
import java.math.BigDecimal
import javax.persistence.*

@Entity
data class StationEntity(
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    val stationId: String?,

    val distance:BigDecimal?,
    val latitude:BigDecimal?,
    val longitude:BigDecimal?,
    val useCount:Int?,
    val id:String?,
    val name:String?,
    val quality:Int?,
    val contribution:BigDecimal?,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="station_id_fk")
    val station: Station,

    ){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as StationEntity

        if (stationId != other.stationId) return false
        if (distance != other.distance) return false
        if (latitude != other.latitude) return false
        if (longitude != other.longitude) return false
        if (useCount != other.useCount) return false
        if (id != other.id) return false
        if (name != other.name) return false
        if (quality != other.quality) return false
        if (contribution != other.contribution) return false

        return true
    }

    override fun hashCode(): Int {
        var result = stationId?.hashCode() ?: 0
        result = 31 * result + (distance?.hashCode() ?: 0)
        result = 31 * result + (latitude?.hashCode() ?: 0)
        result = 31 * result + (longitude?.hashCode() ?: 0)
        result = 31 * result + (useCount ?: 0)
        result = 31 * result + (id?.hashCode() ?: 0)
        result = 31 * result + (name?.hashCode() ?: 0)
        result = 31 * result + (quality ?: 0)
        result = 31 * result + (contribution?.hashCode() ?: 0)
        return result
    }
}
