package com.example.brewproject.data.remote

import com.example.brewproject.data.model.city.CityModel
import com.example.brewproject.data.model.state.StateModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiDetail {

    @GET(ApiReference.CITY)
    suspend fun getCity(): Response<CityModel>

    @GET(ApiReference.STATE)
    suspend fun geyState(): Response<StateModel>
}