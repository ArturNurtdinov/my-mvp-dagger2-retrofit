package com.infinitevoid.my_mvp_dagger2_retrofit.di.module

import android.app.Activity
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: Activity) {
    @Provides
    fun provideActivity(): Activity = activity
}