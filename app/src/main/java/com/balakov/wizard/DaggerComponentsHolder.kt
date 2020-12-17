package com.balakov.wizard

import com.balakov.wizard.di.component.BaseUiComponent
import com.balakov.wizard.di.components.AppComponent
import com.balakov.wizard.signin.di.component.SignInComponent

object DaggerComponentsHolder {

    lateinit var appComponent: AppComponent
    lateinit var baseUiComponent: BaseUiComponent

    lateinit var signInComponent: SignInComponent

}