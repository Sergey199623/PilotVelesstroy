package com.itikpilotvelesstroy

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner
import androidx.multidex.MultiDexApplication
import com.itik.common.di.DiStarter
import com.itik.authentication.authentification.AuthenticationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.component.KoinComponent
import org.koin.core.context.GlobalContext.startKoin

class App : MultiDexApplication(), DiStarter, LifecycleEventObserver {

    override fun onCreate() {
        super.onCreate()

        startDiIfNeed()
    }

    @Synchronized
    override fun startDiIfNeed() {
        if (isDIStarted) {
            return
        }
        val context = this
        startKoin {

            androidContext(context)
            modules(listOf(AuthenticationModule.create()))
        }
    }

    companion object : KoinComponent {
        private var isDIStarted = false
    }

    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        TODO("Not yet implemented")
    }
}