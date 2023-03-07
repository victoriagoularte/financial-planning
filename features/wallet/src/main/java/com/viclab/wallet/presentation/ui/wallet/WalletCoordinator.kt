package com.viclab.wallet.presentation.ui.wallet

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel

/**
 * Screen's coordinator which is responsible for handling actions from the UI layer
 * and one-shot actions based on the new UI state
 */
class WalletCoordinator(
    val viewModel: WalletViewModel
) {
    val screenStateFlow = viewModel.stateFlow

    fun doStuff() {

    }
}

@Composable
fun rememberWalletCoordinator(
    viewModel: WalletViewModel = hiltViewModel()
): WalletCoordinator {
    return remember(viewModel) {
        WalletCoordinator(
            viewModel = viewModel
        )
    }
}