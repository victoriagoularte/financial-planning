package com.viclab.wallet.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.viclab.wallet.presentation.ui.wallet.WalletScreen

const val walletRoute = "wallet_route"

fun NavController.navigateWallet(navOptions: NavOptions? = null) {
    this.navigate(walletRoute, navOptions)
}

fun NavGraphBuilder.walletScreen() {
    composable(route = walletRoute) {
        WalletScreen()
    }
}