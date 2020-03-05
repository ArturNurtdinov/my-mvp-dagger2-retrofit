package com.infinitevoid.my_mvp_dagger2_retrofit.di.component

import com.infinitevoid.my_mvp_dagger2_retrofit.di.module.ActivityModule
import com.infinitevoid.my_mvp_dagger2_retrofit.ui.main.MainActivity
import dagger.Component

@Component(modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)

}