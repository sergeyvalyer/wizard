package com.balakov.wizard.di.components

import android.app.Application
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.balakov.wizard.astatic.scopes.AppScope
import com.balakov.wizard.di.modules.AppModule
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [
        AppModule::class
    ]
)

@AppScope
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun provideApplication(): Application
    fun provideContext(): Context

}