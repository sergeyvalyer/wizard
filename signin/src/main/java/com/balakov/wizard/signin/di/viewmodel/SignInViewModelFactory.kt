package com.balakov.wizard.signin.di.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.balakov.wizard.signin.di.scope.SignInScope
import javax.inject.Inject
import javax.inject.Provider

@SignInScope
class SignInViewModelFactory @Inject constructor(
    private val creators: Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T =
        (creators[modelClass]?.get() as? T)
            ?: throw IllegalArgumentException("Unknown model class $modelClass")

}