package com.infinitevoid.my_mvp_dagger2_retrofit.api

import android.database.Observable
import com.infinitevoid.my_mvp_dagger2_retrofit.models.UserList
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServiceInterface {
    @GET("users")
    fun getUsers(@Query("q") filter: String): Observable<UserList>
}