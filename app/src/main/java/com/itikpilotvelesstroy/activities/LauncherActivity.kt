package com.itikpilotvelesstroy.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.itik.uiKit.utils.initializeNoStatusBar
import com.itikpilotvelesstroy.R

class LauncherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initializeNoStatusBar(false)

        setContentView(R.layout.activity_launcher)
    }
}