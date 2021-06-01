package com.manuel28g.carsalesmobiletestdata.api

import com.manuel28g.carsalesmobiletestdata.model.CovidInfo
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CovidDataAPI {

    @GET("reports/total")
    fun getData(@Query(value="date") date:String): Call<CovidInfo>

    @GET("reports/total")
    fun getData(): Call<CovidInfo>
}
