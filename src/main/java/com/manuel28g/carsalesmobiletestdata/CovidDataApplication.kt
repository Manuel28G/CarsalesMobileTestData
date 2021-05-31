package com.manuel28g.carsalesmobiletestdata

import android.content.Context
import androidx.fragment.app.Fragment
import au.com.carsales.basemodule.BaseModuleApplication
import au.com.carsales.basemodule.router.BaseModuleLifeCycleManager
import com.manuel28g.carsalesmobiletestdata.CovidDataApplication.Companion.applicationComponent
import com.manuel28g.carsalesmobiletestdata.di.CarsaleApplicationDataModule
import com.manuel28g.carsalesmobiletestdata.di.CarsaleMobileComponent
import com.manuel28g.carsalesmobiletestdata.di.DaggerCarsaleMobileComponent

open class CovidDataApplication:BaseModuleApplication() {

    companion object{
        var applicationComponent: CarsaleMobileComponent? = null
    }

    override fun initLifeCycleManager(): BaseModuleLifeCycleManager {
        return BaseModuleLifeCycleManager(this)
    }

    override fun onCreate() {
        super.onCreate()
        appComponent().inject(this)
        buildDagger(this)
    }
}

fun Context.appComponent(): CarsaleMobileComponent {
    return buildDagger(this.applicationContext)
}

fun Fragment.appComponent(): CarsaleMobileComponent {
    return buildDagger(this.requireContext().applicationContext)
}

private fun buildDagger(context: Context): CarsaleMobileComponent {
    if (applicationComponent == null) {
        applicationComponent = DaggerCarsaleMobileComponent
            .builder()
            .carsaleApplicationDataModule(CarsaleApplicationDataModule(context as CovidDataApplication))
            .build()
    }
    return applicationComponent!!
}