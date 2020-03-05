package com.infinitevoid.my_mvp_dagger2_retrofit.di.module

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(private val application: Application) {
    @Provides
    @Singleton
    fun provideApplication(): Application = application
}