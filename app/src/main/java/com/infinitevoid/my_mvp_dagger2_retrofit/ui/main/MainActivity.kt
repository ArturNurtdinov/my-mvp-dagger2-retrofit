package com.infinitevoid.my_mvp_dagger2_retrofit.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.infinitevoid.my_mvp_dagger2_retrofit.R
import com.infinitevoid.my_mvp_dagger2_retrofit.di.component.DaggerActivityComponent
import com.infinitevoid.my_mvp_dagger2_retrofit.di.module.ActivityModule
import com.infinitevoid.my_mvp_dagger2_retrofit.models.UserList

class MainActivity : AppCompatActivity(), MainContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        injectDependency()

    }

    private fun injectDependency() {
        val activityComponent = DaggerActivityComponent.builder()
            .activityModule(ActivityModule(this))
            .build()

        activityComponent.inject(this)
    }

    override fun showData(list : UserList) {

    }
}