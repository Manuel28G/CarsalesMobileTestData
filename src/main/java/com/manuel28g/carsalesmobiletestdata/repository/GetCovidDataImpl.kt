package com.manuel28g.carsalesmobiletestdata.repository

import com.manuel28g.carsalesmobiletestdata.api.CovidDataAPI
import com.manuel28g.carsalesmobiletestdata.model.CovidInfo

import javax.inject.Inject

class GetCovidDataImpl @Inject constructor(var api:CovidDataAPI) :GetCovidData{
    override fun getData(body: String): CovidInfo? {
        return api.getData(body).execute().body()
    }

    override fun getCurrentData(): CovidInfo? {
       return api.getData().execute().body()
    }
}