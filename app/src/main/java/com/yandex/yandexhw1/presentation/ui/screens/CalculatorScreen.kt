package com.yandex.yandexhw1.presentation.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.yandex.yandexhw1.presentation.ui.components.ListItem

@Composable
fun CalculatorScreen(navController: NavController) {
    Column {
        ListItem(
            leftTitle = "Баланс",
            rightTitle = "-670 000 ₽",
            leftIcon = "\uD83D\uDCB0",
            leftIconBackground = Color(0xFFFFFFFF),
            listBackground = Color(0xFFD4FAE6),
            listHeight = 56
        )
        HorizontalDivider()
        ListItem(
            leftTitle = "Валюта",
            rightTitle = "₽",
            listBackground = Color(0xFFD4FAE6),
            listHeight = 56
        )
    }
}