package com.manuel28g.carsalesmobiletestdata.repository

import com.manuel28g.carsalesmobiletestdata.model.CovidInfo
import kotlinx.coroutines.flow.Flow

interface GetCovidData {
    fun getData(body: String): CovidInfo?
    fun getCurrentData(): CovidInfo?
}