package com.balakov.wizard.signin.ui

import android.os.Bundle
import com.balakov.wizard.base.BaseFragment
import com.balakov.wizard.signin.R
import com.balakov.wizard.signin.di.component.ComponentHolder
import com.balakov.wizard.signin.vm.SignInViewModel

class SignInFragment : BaseFragment<SignInViewModel>(R.layout.layout_sign_in) {

    override fun getViewModelClass(): Class<SignInViewModel> = SignInViewModel::class.java

    override fun onCreate(savedInstanceState: Bundle?) {
        ComponentHolder.signInComponent.inject(viewFactoryWrapper)
        super.onCreate(savedInstanceState)
        viewModel.meh()
    }
}