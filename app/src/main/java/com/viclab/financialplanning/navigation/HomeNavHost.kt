package com.viclab.financialplanning.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.viclab.wallet.navigation.navigateWallet
import com.viclab.wallet.navigation.walletScreen

@Composable
fun HomeNavHost(
    navController: NavHostController,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier,
    startDestination: String = homeRoute
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {
        homeGraph { navController.navigateWallet() }
        walletScreen()
    }
}
