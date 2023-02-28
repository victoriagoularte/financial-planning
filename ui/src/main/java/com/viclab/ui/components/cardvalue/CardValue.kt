package com.viclab.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.viclab.ui.theme.FinancialPlanningTheme


@Composable
fun CardValue(
    text: String,
    modifier: Modifier = Modifier,
) {
    val customCardColors = CardDefaults.cardColors(
        contentColor = MaterialTheme.colorScheme.secondary,
        containerColor = MaterialTheme.colorScheme.secondaryContainer,
        disabledContentColor = MaterialTheme.colorScheme.surface,
        disabledContainerColor = MaterialTheme.colorScheme.onSurface,
    )
    val customCardElevation = CardDefaults.cardElevation(
        defaultElevation = 8.dp,
        pressedElevation = 2.dp,
        focusedElevation = 4.dp
    )

    Card(
        shape = CardDefaults.shape,
        modifier = modifier.padding(16.dp),
        colors = customCardColors,
        elevation = customCardElevation
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Column(
                modifier = Modifier
                .fillMaxWidth(),
            ) {
                Text(text = "Saldo",
                    style = MaterialTheme.typography.labelLarge,
                    modifier = Modifier
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = text,
                    style = MaterialTheme.typography.headlineMedium,
                    modifier = Modifier
                )
            }
        }
    }
}

@Preview(showBackground = true, name = "CardValue")
@Preview(showBackground = true, name = "CardValueDarkMode", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun PreviewCardValue() {
    FinancialPlanningTheme {
        Column(modifier = Modifier.fillMaxWidth()) {
            CardValue("R$ 1.000,00")
        }
    }
}