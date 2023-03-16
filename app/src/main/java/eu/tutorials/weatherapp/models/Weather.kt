package eu.tutorials.weatherapp.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Weather(
    val id: Int,
    @SerializedName("main")
    val main: String,
    val description: String,
    val icon: String
) : Serializable