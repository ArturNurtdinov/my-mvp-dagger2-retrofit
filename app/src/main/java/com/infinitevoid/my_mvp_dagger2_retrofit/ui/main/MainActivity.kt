package com.infinitevoid.my_mvp_dagger2_retrofit.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.infinitevoid.my_mvp_dagger2_retrofit.R
import com.infinitevoid.my_mvp_dagger2_retrofit.di.component.DaggerActivityComponent
import com.infinitevoid.my_mvp_dagger2_retrofit.di.module.ActivityModule
import com.infinitevoid.my_mvp_dagger2_retrofit.models.UserList
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContract.View {

    private val presenter : MainPresenter = MainPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        injectDependency()

        presenter.loadData()
    }

    private fun injectDependency() {
        val activityComponent = DaggerActivityComponent.builder()
            .activityModule(ActivityModule(this))
            .build()

        activityComponent.inject(this)
        presenter.attach(this)
    }

    override fun showData(list: UserList) {
        main_text_view.text = list.total_count.toString()
    }
}