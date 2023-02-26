package com.itik.uiKit.utils

import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.itik.source.uiKit.R

private const val TRANSPARENT_STATUS_BAR_BASE_FLAGS = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
private const val TRANSPARENT_STATUS_BAR_LIGHT_ICONS_FLAGS = TRANSPARENT_STATUS_BAR_BASE_FLAGS
private const val TRANSPARENT_STATUS_BAR_DARK_ICONS_FLAGS = TRANSPARENT_STATUS_BAR_BASE_FLAGS or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR

fun getTransparentStatusBarBaseFlags(lightStatusBarIcons: Boolean) =
    if (lightStatusBarIcons) {
        TRANSPARENT_STATUS_BAR_LIGHT_ICONS_FLAGS
    } else {
        TRANSPARENT_STATUS_BAR_DARK_ICONS_FLAGS
    }

fun AppCompatActivity.initializeNoStatusBar(lightStatusBarIcons: Boolean) {
    window.statusBarColor = ContextCompat.getColor(this, R.color.transparent)
    window.decorView.systemUiVisibility = getTransparentStatusBarBaseFlags(lightStatusBarIcons)
    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
    supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
}