package com.itik.authentication.authentification

import androidx.fragment.app.FragmentActivity

interface AuthenticationStarter {

    fun goToAuthentication()

    fun openAuthenticationScreen()

    fun setActivity(activity: FragmentActivity)

    fun close()
}