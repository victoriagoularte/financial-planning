package com.viclab.wallet.presentation.ui.wallet

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf


/**
 * UI State that represents WalletScreen
 **/
class WalletState

/**
 * Wallet Actions emitted from the UI Layer
 * passed to the coordinator to handle
 **/
data class WalletActions(
    val onClick: () -> Unit = {}
)

/**
 * Compose Utility to retrieve actions from nested components
 **/
val LocalWalletActions = staticCompositionLocalOf<WalletActions> {
    error("{NAME} Actions Were not provided, make sure ProvideWalletActions is called")
}

@Composable
fun ProvideWalletActions(actions: WalletActions, content: @Composable () -> Unit) {
    CompositionLocalProvider(LocalWalletActions provides actions) {
        content.invoke()
    }
}

