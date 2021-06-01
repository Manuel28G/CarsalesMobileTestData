package com.manuel28g.carsalesmobiletestdata.service

import au.com.carsales.basemodule.context
import au.com.carsales.basemodule.getAppContext
import com.manuel28g.carsalesmobiletestdata.appComponent
import com.manuel28g.carsalesmobiletestdata.repository.GetCovidData

import kotlinx.coroutines.flow.flow

import javax.inject.Inject

class CovidDataServiceImpl: CovidDataService {

    @Inject
    lateinit var repository:GetCovidData

    init {
        context?.appComponent()?.inject(this)
    }

    override fun getData(body:String) = flow{
            var response = repository.getData(body)
            emit(response)
    }

    override fun getCurrentData() = flow{
            var response = repository.getCurrentData()
            emit(response)
    }


}