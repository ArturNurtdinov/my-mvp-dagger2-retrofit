package com.infinitevoid.my_mvp_dagger2_retrofit.ui.main

import android.util.Log
import com.infinitevoid.my_mvp_dagger2_retrofit.api.ApiServiceInterface
import com.infinitevoid.my_mvp_dagger2_retrofit.models.UserList
import com.infinitevoid.my_mvp_dagger2_retrofit.ui.di.DaggerApiComponent
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MainPresenter : MainContract.Presenter {
    init {
        DaggerApiComponent.create().inject(this)
    }
    private val subscriptions = CompositeDisposable()
    lateinit var view: MainContract.View
    @Inject lateinit var api: ApiServiceInterface

    override fun loadData() {
        Log.d("MY_TAG", "Happened!")
        val disposable = api.getUsers("rokano").subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ userList: UserList? ->
                view.showData(userList!!)
            }, { error ->
                Log.d("MY_TAG", error.localizedMessage)
            })

        subscriptions.add(disposable)
    }

    override fun subscribe() {

    }

    override fun unsubscribe() {
        subscriptions.clear()
    }

    override fun attach(view: MainContract.View) {
        this.view = view
    }

}