package com.yandex.yandexhw1.presentation.ui.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.yandex.yandexhw1.domain.Expense
import com.yandex.yandexhw1.presentation.ui.components.ExpenseItem
import com.yandex.yandexhw1.presentation.ui.components.ListItem
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols

@Composable
fun ExpensesScreen(navController: NavController) {
    val expenses = remember {
        listOf(
            Expense(id = 0, category = "Аренда квартиры", amount = 100000, image = "\uD83C\uDFE1"),
            Expense(id = 1, category = "Одежда", amount = 100000, image = "\uD83D\uDC57"),
            Expense(id = 2, category = "На собачку", comment = "Джек", amount = 100000, image = "\uD83D\uDC36"),
            Expense(id = 3, category = "На собачку", comment = "Энни", amount = 100000, image = "\uD83D\uDC36"),
            Expense(id = 4, category = "Ремонт квартиры", amount = 100000, image = "РК"),
            Expense(id = 5, category = "Продукты", amount = 100000, image = "\uD83C\uDF6D"),
            Expense(id = 6, category = "Спортзал", amount = 100000, image = "\uD83C\uDFCB\uFE0F"),
            Expense(id = 7, category = "Медицина", amount = 100000, image = "\uD83D\uDC8A")
        )
    }

    LazyColumn {
        item {
            ListItem(
                leftTitle = "Всего",
                rightTitle = "436 558 ₽",
                listBackground = Color(0xFFD4FAE6),
                listHeight = 56
            )
            HorizontalDivider()
        }
        items(expenses) { expense ->
            ExpenseItem(expense)
            HorizontalDivider()
        }
    }
}

fun formatNumber(number: Int): String {
    val symbols = DecimalFormatSymbols().apply {
        groupingSeparator = ' '
    }
    val formatter = DecimalFormat("#,###", symbols)
    return formatter.format(number) + "₽"
}


