package com.applikdos.restservicewithkotlin.di

import android.app.Activity
import com.applikdos.restservicewithkotlin.model.MainInteractor
import com.applikdos.restservicewithkotlin.model.MainInteractorImpl
import com.applikdos.restservicewithkotlin.presenter.MainPresenter
import com.applikdos.restservicewithkotlin.presenter.MainPresenterImpl
import com.applikdos.restservicewithkotlin.view.MainActivity
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class MainModule {

    /* @Binds
     abstract fun bindMainActivity(
         mainActivity: MainActivity
     ): MainView*/

    @Binds
    abstract fun bindMainPresenter(
        mainPresenterImpl: MainPresenterImpl
    ): MainPresenter


    @Binds
    abstract fun bindMainInteractor(
        mainInteractorImpl: MainInteractorImpl
    ): MainInteractor
}

@InstallIn(ActivityComponent::class)
@Module
object MainActivityModule {

    @Provides
    fun bindActivity(activity: Activity): MainActivity {
        return activity as MainActivity
    }
}