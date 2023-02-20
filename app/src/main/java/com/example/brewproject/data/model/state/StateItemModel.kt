package com.example.brewproject.data.model.state

import com.google.gson.annotations.SerializedName

data class StateItemModel (
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("state")
    val state: String? = "",
    @SerializedName("street")
    val street: String? = "",
    @SerializedName("country")
    val country: String? = ""
        )