package eu.tutorials.weatherapp.models

import java.io.Serializable

data class Main(
    val temp: Double,
    val pressure: Int,
    val humidity: Int,
    val tempMin: Double,
    val tempMax: Double,
    val sea_level:Double,
    val grnd_level: Double
) : Serializable