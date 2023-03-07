package com.viclab.home.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.viclab.home.presentation.ui.HomeGraph

const val homeRoute = "home_route"

fun NavController.navigateHome(navOptions: NavOptions? = null) {
    this.navigate(homeRoute, navOptions)
}

fun NavGraphBuilder.homeGraph(navigateToWallet: () -> Unit,) {
    composable(route = homeRoute) {
        HomeGraph(navigateToWallet = navigateToWallet)
    }
}