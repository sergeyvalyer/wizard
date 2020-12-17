package com.balakov.wizard.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.balakov.wizard.di.component.DaggerBaseUiComponent
import javax.inject.Inject

abstract class BaseFragment<VM : BaseViewModel>(@LayoutRes layoutId: Int) : Fragment(layoutId) {

    var viewFactoryWrapper: FactoryWrapper = FactoryWrapper()

    abstract fun getViewModelClass(): Class<VM>

    val viewModel: VM by lazy {
        ViewModelProviders
            .of(this, viewFactoryWrapper.factory)
            .get(getViewModelClass())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}

class FactoryWrapper {
    @Inject
    lateinit var factory: ViewModelProvider.Factory
}