package com.example.brewproject.data.model.city

import com.google.gson.annotations.SerializedName

data class CityItemModel (

    @SerializedName("name")
    val name: String? = "",
    @SerializedName("city")
    val city: String? = "",
    @SerializedName("street")
    val street: String? = "",
    @SerializedName("country")
    val country: String? = ""
)