package com.balakov.wizard.signin.di.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.balakov.wizard.di.viewmodel.ViewModelKey
import com.balakov.wizard.dto.FormModel
import com.balakov.wizard.signin.di.scope.SignInScope
import com.balakov.wizard.signin.di.viewmodel.SignInViewModelFactory
import com.balakov.wizard.signin.vm.SignInViewModel
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

@Module
interface SignInModule {

    @Binds
    @SignInScope
    fun bindViewModelFactory(viewModelFactory: SignInViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(SignInViewModel::class)
    fun bindSignInViewModel(viewModel: SignInViewModel): ViewModel
}