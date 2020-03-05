package com.infinitevoid.my_mvp_dagger2_retrofit.models

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("id") val id: Int,
    @SerializedName("login") val login: String,
    @SerializedName("score") val score: Float
)