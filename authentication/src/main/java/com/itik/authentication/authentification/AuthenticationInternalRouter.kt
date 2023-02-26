package com.itik.authentication.authentification

import android.content.Context
import android.content.Intent
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.itik.authentication.R
import com.itik.authentication.authentification.view.AuthenticationFragment
import java.lang.ref.WeakReference

internal class AuthenticationInternalRouter(
    private val context: Context
) : AuthenticationStarter {

    private var activity: WeakReference<FragmentActivity>? = null

    override fun setActivity(activity: FragmentActivity) {
        this.activity = WeakReference(activity)
    }

    override fun goToAuthentication() {
        val intent = Intent(context, AuthenticationActivity::class.java)
        context.startActivity(intent)
    }

    override fun openAuthenticationScreen() {
        openFragment(AuthenticationFragment.newInstance())
    }

    override fun close() {
        activity?.get()?.finish()
    }

    private fun openFragment(fragment: Fragment) {
        activity?.get()?.supportFragmentManager?.beginTransaction()
            ?.replace(R.id.frameLayoutAuthentication, fragment)
            ?.addToBackStack("")
            ?.commit()
    }

}