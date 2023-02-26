package com.itik.authentication.authentification

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.itik.authentication.R
import com.itik.uiKit.utils.initializeNoStatusBar
import org.koin.android.ext.android.inject

class AuthenticationActivity : AppCompatActivity() {

    private val router: AuthenticationStarter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        initializeNoStatusBar(false)
        super.onCreate(savedInstanceState)
        router.setActivity(this)

        setContentView(R.layout.activity_authentication)

        router.openAuthenticationScreen()
    }

    companion object {

        @JvmStatic
        fun newIntent(
            context: Context
        ): Intent = Intent(context, AuthenticationActivity::class.java)
    }
}