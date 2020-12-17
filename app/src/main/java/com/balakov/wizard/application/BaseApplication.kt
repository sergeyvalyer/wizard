package com.balakov.wizard.application

import android.app.Application
import android.util.Log
import com.balakov.wizard.DaggerComponentsHolder
import com.balakov.wizard.di.component.DaggerBaseUiComponent
import com.balakov.wizard.di.components.DaggerAppComponent

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        components.apply {
            Log.w("meh", "on create application")
            appComponent = DaggerAppComponent.builder()
                .application(this@BaseApplication)
                .build()
            baseUiComponent = DaggerBaseUiComponent.builder().build()
        }
    }

    companion object {
        val components = DaggerComponentsHolder
    }
}