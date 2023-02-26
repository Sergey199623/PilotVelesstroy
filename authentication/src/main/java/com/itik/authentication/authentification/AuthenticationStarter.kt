package com.itik.authentication.authentification

import androidx.fragment.app.FragmentActivity

interface AuthenticationStarter {

    fun setActivity(activity: FragmentActivity)

    fun goToAuthenticationScreen()

    fun close()
}