package com.infinitevoid.my_mvp_dagger2_retrofit.ui.di

import com.infinitevoid.my_mvp_dagger2_retrofit.ui.main.MainPresenter
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {
    fun inject(presenter : MainPresenter)
}