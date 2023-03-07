package com.viclab.wallet.presentation.ui.wallet

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.viclab.ui.theme.FinancialPlanningTheme

@Composable
fun WalletScreen(
    state: WalletState = WalletState(),
    actions: WalletActions = WalletActions()
) {
    Text("Wallet Screen")
}

@Composable
@Preview(name = "Wallet")
private fun WalletScreenPreview() {
    FinancialPlanningTheme() {
        WalletScreen()
    }
}

