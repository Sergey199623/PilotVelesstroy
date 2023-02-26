package com.itik.authentication.authentification.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.itikpilotvelesstroy.R
import com.itik.authentication.authentification.viewModel.AuthenticationViewModel
import com.itik.authentication.authentification.viewModel.AuthenticationViewOutput
import com.itikpilotvelesstroy.databinding.FragmentAuthenticationBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class AuthenticationFragment : Fragment() {

    private val viewOutput: AuthenticationViewOutput by viewModel<AuthenticationViewModel>()
//    private val binding by viewBinding { FragmentAuthenticationBinding.bind(it) }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
        inflater.inflate(R.layout.fragment_authentication, container, false)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setStyle(DialogFragment.STYLE_NORMAL, R.style.BottomSheetDialog)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        binding.referralMainAddParent.setClickAction { viewOutput.onAddParentClicked() }
//        binding.referralMainAddChild.setClickAction { viewOutput.onAddChildClicked() }
//        binding.referralMainShareLink.setClickAction { viewOutput.onShareLinkClicked() }
//        binding.referralMainShowQr.setClickAction { viewOutput.onShowQrClicked() }
//
//        viewOutput.onViewCreated()
    }

    companion object {
        const val TAG = "ReferralMainFragment"

        fun newInstance() = AuthenticationFragment()
    }
}