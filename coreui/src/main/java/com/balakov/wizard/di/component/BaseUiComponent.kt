package com.balakov.wizard.di.component

import com.balakov.wizard.astatic.scopes.AppScope
import com.balakov.wizard.base.FactoryWrapper
import com.balakov.wizard.di.module.BaseUiModule
import dagger.Component

@Component(
    modules = [BaseUiModule::class]
)

@AppScope
interface BaseUiComponent {

//    fun inject(factoryWrapper: FactoryWrapper)

}
