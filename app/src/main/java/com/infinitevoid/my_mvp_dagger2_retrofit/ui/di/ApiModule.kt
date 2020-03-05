package com.infinitevoid.my_mvp_dagger2_retrofit.ui.di

import com.infinitevoid.my_mvp_dagger2_retrofit.api.ApiServiceInterface
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

@Module
class ApiModule {
    @Provides
    fun provideApi() : ApiServiceInterface {
        return Retrofit.Builder()
            .baseUrl("https://api.github.com/search/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create(ApiServiceInterface::class.java)
    }
}