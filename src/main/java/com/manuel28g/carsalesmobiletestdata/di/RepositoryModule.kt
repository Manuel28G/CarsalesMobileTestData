package com.manuel28g.carsalesmobiletestdata.di

import com.manuel28g.carsalesmobiletestdata.api.CovidDataAPI
import com.manuel28g.carsalesmobiletestdata.helpers.RetrofitHelper
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun provideCovidData(): CovidDataAPI {
        return RetrofitHelper().getInstance()
    }


}