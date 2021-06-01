package com.manuel28g.carsalesmobiletestdata.di

import android.app.Application
import au.com.carsales.basemodule.dependency.component.BaseApplicationComponent
import com.manuel28g.carsalesmobiletestdata.service.CovidDataServiceImpl
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [
        RepositoryModule::class,
        CarsaleApplicationDataModule::class
    ]
)

@Singleton
interface CarsaleMobileComponent: BaseApplicationComponent {
        fun inject(application: Application)
        fun inject(repository: CovidDataServiceImpl)
}