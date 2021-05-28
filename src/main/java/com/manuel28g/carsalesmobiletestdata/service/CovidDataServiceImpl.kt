package com.manuel28g.carsalesmobiletestdata.service

import com.manuel28g.carsalesmobiletestdata.api.CovidDataAPI
import kotlinx.coroutines.flow.flow

class CovidDataServiceImpl(var api: CovidDataAPI): CovidDataService {

    override fun getData(body:String) = flow{
//            var response = api.getData(body).execute()
//            emit(response.body())
        emit("aqui")
    }

    override fun getCurrentData() = flow{
//            var response = api.getData().execute()
//            emit(response.body())
        emit("Aca")
    }
}