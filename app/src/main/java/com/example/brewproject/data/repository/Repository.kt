package com.example.brewproject.data.repository

import com.example.brewproject.data.model.city.CityModel
import com.example.brewproject.data.model.state.StateModel
import retrofit2.Response

interface Repository {

    suspend fun getCity(): Response<CityModel>

    suspend fun getState(): Response<StateModel>
}