package com.manuel28g.carsalesmobiletestdata.service

import com.manuel28g.carsalesmobiletestdata.helpers.RetrofitHelper
import kotlinx.coroutines.flow.flow

class CovidDataServiceImpl: CovidDataService {

    override fun getData(body:String) = flow{
            var response = RetrofitHelper().getInstance().getData(body).execute()
            emit(response.body())
    }

    override fun getCurrentData() = flow{
            var response = RetrofitHelper().getInstance().getData().execute()
            emit(response.body())
    }
}