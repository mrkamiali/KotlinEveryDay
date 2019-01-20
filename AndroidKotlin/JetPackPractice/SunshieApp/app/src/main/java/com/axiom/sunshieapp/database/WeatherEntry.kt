package com.axiom.sunshieapp.database

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import java.util.*


@Entity(tableName = "weather", indices = [Index(value = ["date"], unique = true)])
data class WeatherEntry (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val weatherIconId: Int = 0,
    val date: Date? = null,
    val min: Double = 0.0,
    val max: Double = 0.0,
    val humidity: Double = 0.0,
    val pressure: Double = 0.0,
    val wind: Double = 0.0,
    val degrees: Double = 0.0

)