package com.infinitevoid.my_mvp_dagger2_retrofit.ui.main

import io.reactivex.disposables.CompositeDisposable

class MainPresenter : MainContract.Presenter {

    private val subscriptions = CompositeDisposable()
    private lateinit var view: MainContract.View
    
    override fun loadData() {

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