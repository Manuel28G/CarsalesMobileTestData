package com.manuel28g.carsalesmobiletestdata.di

import com.manuel28g.carsalesmobiletestdata.api.CovidDataAPI
import com.manuel28g.carsalesmobiletestdata.helpers.RetrofitHelper
import com.manuel28g.carsalesmobiletestdata.repository.GetCovidData
import com.manuel28g.carsalesmobiletestdata.repository.GetCovidDataImpl
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun provideCovidData(): CovidDataAPI {
        return RetrofitHelper().getInstance()
    }

    @Singleton
    @Provides
    fun provideCovidRepository(api: CovidDataAPI): GetCovidData {
        return GetCovidDataImpl(api)
    }

}