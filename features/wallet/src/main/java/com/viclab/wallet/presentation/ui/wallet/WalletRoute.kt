package com.viclab.wallet.presentation.ui.wallet

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember

@Composable
fun WalletRoute(
    coordinator: WalletCoordinator = rememberWalletCoordinator()
) {
    // State observing and declarations
    val uiState by coordinator.screenStateFlow.collectAsState(WalletState())

    // UI Actions
    val actions = rememberWalletActions(coordinator)

    // UI Rendering
    WalletScreen(uiState, actions)
}


@Composable
fun rememberWalletActions(coordinator: WalletCoordinator): WalletActions {
    return remember(coordinator) {
        WalletActions(
            onClick = coordinator::doStuff
        )
    }
}