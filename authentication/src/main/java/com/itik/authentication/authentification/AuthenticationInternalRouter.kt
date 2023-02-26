package com.itik.authentication.authentification

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.itikpilotvelesstroy.R
import com.itik.authentication.authentification.view.AuthenticationFragment
import java.lang.ref.WeakReference

internal class AuthenticationInternalRouter : AuthenticationStarter {

    private var activity: WeakReference<FragmentActivity>? = null

    override fun setActivity(activity: FragmentActivity) {
        this.activity = WeakReference(activity)
    }

    override fun goToAuthenticationScreen() {
        openFragment(AuthenticationFragment.newInstance())
    }

    override fun close() {
        activity?.get()?.finish()
    }

    private fun openFragment(fragment: Fragment) {
        activity?.get()?.supportFragmentManager?.beginTransaction()
            ?.replace(R.id.frameLayoutLauncher, fragment)
            ?.addToBackStack("")
            ?.commit()
    }

}