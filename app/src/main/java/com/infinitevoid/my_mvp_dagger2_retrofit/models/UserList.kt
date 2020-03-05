package com.infinitevoid.my_mvp_dagger2_retrofit.models

import com.google.gson.annotations.SerializedName

data class UserList(
    @SerializedName("items")
    val users: List<User>,
    @SerializedName("total_count")
    val total_count: Int,
    @SerializedName("incomplete_results")
    val incomplete_results: Boolean
)