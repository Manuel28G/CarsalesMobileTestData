package com.manuel28g.carsalesmobiletestdata.di

import au.com.carsales.basemodule.dependency.component.BaseApplicationComponent
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

}