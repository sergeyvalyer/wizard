package com.balakov.wizard.signin.di.modules

import com.balakov.wizard.dto.FormModel
import com.balakov.wizard.signin.di.scope.SignInScope
import com.balakov.wizard.signin.di.viewmodel.SignInViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class SignInDtoModule {
    @Provides
    @SignInScope
    fun provideFormModel(): FormModel = FormModel("123")
}