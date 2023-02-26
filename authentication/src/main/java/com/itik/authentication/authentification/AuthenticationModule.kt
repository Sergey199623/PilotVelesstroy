package com.itik.authentication.authentification

import com.itik.authentication.authentification.viewModel.AuthenticationViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object AuthenticationModule {

    fun create() = module {
        single<AuthenticationStarter> { AuthenticationInternalRouter() }
        viewModel { AuthenticationViewModel() }
    }
}