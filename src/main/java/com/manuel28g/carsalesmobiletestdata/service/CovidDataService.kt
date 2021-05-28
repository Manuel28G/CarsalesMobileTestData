package com.manuel28g.carsalesmobiletestdata.service

import com.manuel28g.carsalesmobiletestdata.model.CovidInfo
import kotlinx.coroutines.flow.Flow

interface CovidDataService {
    fun getData(body: String): Flow<String>
    fun getCurrentData(): Flow<String>
}