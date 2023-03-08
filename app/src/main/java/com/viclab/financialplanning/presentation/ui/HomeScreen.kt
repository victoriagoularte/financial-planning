package com.viclab.home.presentation.ui

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Calculate
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.More
import androidx.compose.material.icons.filled.NextPlan
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.viclab.ui.components.CardValue
import com.viclab.ui.components.shortcuts.CardShortcutCollection
import com.viclab.ui.components.shortcuts.Shortcut
import com.viclab.ui.theme.FinancialPlanningTheme

@Composable
fun HomeGraph(
    navigateToWallet: () -> Unit,
    modifier: Modifier = Modifier) {
    Column(modifier = modifier
        .verticalScroll(rememberScrollState())
    ) {
        CardValue("R$ 1.000,00", navigateToWallet)
        CardShortcutCollection(functionalityList = listOf(
            Shortcut(Icons.Default.CalendarMonth, "Agenda") {},
            Shortcut(Icons.Default.Calculate, "Calculadora") {},
            Shortcut(Icons.Default.NextPlan, "Planos") {},
            Shortcut(Icons.Default.More, "Outros") {}
        ))
    }
}


@ExperimentalMaterial3Api
@Preview(showBackground = false)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun HomePreview() {
    FinancialPlanningTheme {
        Scaffold { padding ->
            HomeGraph({}, Modifier.padding(padding))
        }
    }
}