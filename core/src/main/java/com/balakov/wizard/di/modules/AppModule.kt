package com.balakov.wizard.di.modules

import android.app.Application
import android.content.Context
import com.balakov.wizard.astatic.scopes.AppScope
import com.balakov.wizard.dto.FormModel
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @AppScope
    @Provides
    fun provideContext(application: Application): Context = application

    @Singleton
    @Provides
    fun provideFormModel(): FormModel = FormModel("123")
}