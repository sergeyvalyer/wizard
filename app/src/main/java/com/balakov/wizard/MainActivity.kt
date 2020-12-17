package com.balakov.wizard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.balakov.wizard.application.BaseApplication
import com.balakov.wizard.signin.di.component.ComponentHolder
import com.balakov.wizard.signin.di.component.DaggerSignInComponent
import com.balakov.wizard.signin.ui.SignInFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("meh", "on create main activity")
        ComponentHolder.signInComponent = DaggerSignInComponent.builder()
            .appComponent(BaseApplication.components.appComponent)
            .build()
//        BaseApplication.components.signInComponent = DaggerSignInComponent.builder()
//            .appComponent(BaseApplication.components.appComponent)
//            .build()
        val frag = SignInFragment()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentView, frag)
            commit()
        }
    }
}
