package com.itikpilotvelesstroy.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.itik.authentication.authentification.AuthenticationStarter
import com.itik.uiKit.utils.initializeNoStatusBar
import com.itikpilotvelesstroy.R
import org.koin.android.ext.android.inject

class LauncherActivity : AppCompatActivity() {

    private val starter: AuthenticationStarter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initializeNoStatusBar(false)

        setContentView(R.layout.activity_launcher)

        starter.goToAuthentication()
    }
}