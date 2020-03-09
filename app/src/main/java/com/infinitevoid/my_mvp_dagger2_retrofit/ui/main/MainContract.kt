package com.infinitevoid.my_mvp_dagger2_retrofit.ui.main

import com.infinitevoid.my_mvp_dagger2_retrofit.models.UserList
import com.infinitevoid.my_mvp_dagger2_retrofit.ui.base.BaseContract

class MainContract {
    interface View : BaseContract.View {
        fun showData(list : UserList)
    }

    interface Presenter : BaseContract.Presenter<View> {
        fun loadData()
    }
}