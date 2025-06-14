package com.yandex.yandexhw1.presentation.ui.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.yandex.yandexhw1.presentation.ui.components.IncomeItem
import com.yandex.yandexhw1.domain.Income
import com.yandex.yandexhw1.presentation.ui.components.ListItem

@Composable
fun IncomesScreen(navController: NavController) {
    val incomes = remember {
        listOf(
            Income(id = 0, category = "Зарплата", 500000),
            Income(id = 1, category = "Подработка", 100000)
        )
    }

    LazyColumn {
        item {
            ListItem(
                leftTitle = "Всего",
                rightTitle = "600 000 ₽",
                listBackground = Color(0xFFD4FAE6),
                listHeight = 56
            )
            HorizontalDivider()
        }
        items(incomes) { income ->
            IncomeItem(income)
            HorizontalDivider()
        }
    }
}