package com.balakov.wizard.signin.di.component

import com.balakov.wizard.base.FactoryWrapper
import com.balakov.wizard.di.components.AppComponent
import com.balakov.wizard.signin.di.modules.SignInDtoModule
import com.balakov.wizard.signin.di.modules.SignInModule
import com.balakov.wizard.signin.di.scope.SignInScope
import dagger.Component

@Component(
    dependencies = [AppComponent::class],
    modules = [SignInModule::class, SignInDtoModule::class]
)

@SignInScope
interface SignInComponent {
    fun inject(viewFactoryWrapper: FactoryWrapper)
}