package com.example.brewproject.data.repository

import com.example.brewproject.data.model.city.CityModel
import com.example.brewproject.data.model.state.StateModel
import com.example.brewproject.data.remote.ApiDetail
import retrofit2.Response
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    val apiDetail: ApiDetail
): Repository {

    override suspend fun getCity(): Response<CityModel> {
        return apiDetail.getCity()
    }

    override suspend fun getState(): Response<StateModel> {
        return apiDetail.geyState()
    }
}