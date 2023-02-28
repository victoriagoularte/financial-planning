package com.viclab.home.presentation

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { HomeScreen() }
    }
}

@Composable
fun HomeContent(modifier: Modifier = Modifier) {
    Column(modifier = modifier
        .verticalScroll(rememberScrollState())
    ) {
        CardValue("R$ 1.000,00")
        CardShortcutCollection(functionalityList = listOf(
            Shortcut(Icons.Default.CalendarMonth, "Agenda") {},
            Shortcut(Icons.Default.Calculate, "Calculadora") {},
            Shortcut(Icons.Default.NextPlan, "Planos") {},
            Shortcut(Icons.Default.More, "Outros") {}
        ))
    }
}

@ExperimentalMaterial3Api
@Composable
fun HomeScreen() {
    FinancialPlanningTheme {
        Scaffold { padding ->
            HomeContent(Modifier.padding(padding))
        }
    }
}

@ExperimentalMaterial3Api
@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun HomePreview() {
    FinancialPlanningTheme {
        Scaffold { padding ->
            HomeContent(Modifier.padding(padding))
        }
    }
}