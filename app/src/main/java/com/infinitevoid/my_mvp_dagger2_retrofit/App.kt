package com.infinitevoid.my_mvp_dagger2_retrofit

import android.app.Application
import com.infinitevoid.my_mvp_dagger2_retrofit.di.component.ApplicationComponent
import com.infinitevoid.my_mvp_dagger2_retrofit.di.component.DaggerApplicationComponent

class App : Application() {
    lateinit var component: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        instance = this
        setup()
    }

    private fun setup() {
        DaggerApplicationComponent.create().inject(this)
    }

    companion object {
        lateinit var instance: App private set
    }
}
