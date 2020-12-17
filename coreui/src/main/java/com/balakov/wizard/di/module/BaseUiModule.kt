package com.balakov.wizard.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.balakov.wizard.astatic.scopes.AppScope
import com.balakov.wizard.base.BaseViewModel
import com.balakov.wizard.di.viewmodel.ViewModelFactory
import com.balakov.wizard.di.viewmodel.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Module
interface BaseUiModule  {

//    @Binds
//    @AppScope
//    fun bindViewModelFactory (viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}