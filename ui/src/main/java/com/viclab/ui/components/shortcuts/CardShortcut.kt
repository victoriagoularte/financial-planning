package com.viclab.ui.components.shortcuts

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Calculate
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.More
import androidx.compose.material.icons.filled.NextPlan
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.viclab.ui.theme.FinancialPlanningTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardShortcut(
    icon: ImageVector,
    label: String = "Agenda",
    onClick: (() -> Unit),
    modifier: Modifier = Modifier
) {
    Surface(
        onClick = onClick,
        color = MaterialTheme.colorScheme.surface,
        shape = MaterialTheme.shapes.small,
        modifier = modifier
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .width(128.dp)
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                modifier = Modifier.padding(8.dp)
            )
            Text(
                text = label,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier
            )
        }
    }
}

@Composable
fun CardShortcutCollection(
    functionalityList: List<Shortcut>,
    modifier: Modifier = Modifier
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(16.dp),
        modifier = modifier
    ) {
        items(functionalityList) { item ->
                CardShortcut(item.icon, item.label, item.onClick)
        }
    }
}


@Preview(showBackground = true, name = "CardShortcut")
@Preview(showBackground = true, name = "CardShortcut Dark", uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun PreviewCardShortcut() {
    FinancialPlanningTheme {
        CardShortcutCollection(functionalityList = listOf(
            Shortcut(Icons.Default.CalendarMonth, "Agenda") {},
            Shortcut(Icons.Default.Calculate, "Calculadora") {},
            Shortcut(Icons.Default.NextPlan, "Planos") {},
            Shortcut(Icons.Default.More, "Outros") {}
        ))
    }
}

data class Shortcut(
    val icon: ImageVector,
    val label: String,
    val onClick: () -> Unit
)