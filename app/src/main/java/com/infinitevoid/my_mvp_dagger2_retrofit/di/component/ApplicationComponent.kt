package com.infinitevoid.my_mvp_dagger2_retrofit.di.component

import com.infinitevoid.my_mvp_dagger2_retrofit.App
import com.infinitevoid.my_mvp_dagger2_retrofit.di.module.ApplicationModule
import dagger.Component

@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: App)

}