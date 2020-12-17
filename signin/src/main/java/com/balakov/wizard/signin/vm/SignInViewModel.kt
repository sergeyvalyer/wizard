package com.balakov.wizard.signin.vm

import android.util.Log
import com.balakov.wizard.base.BaseViewModel
import com.balakov.wizard.dto.FormModel
import javax.inject.Inject

class SignInViewModel @Inject constructor(
    private val formModel: FormModel
) : BaseViewModel() {

    init {
        Log.w("meh", "meh")
    }

    fun meh() {
        Log.w("meh", formModel.toString())
    }
}