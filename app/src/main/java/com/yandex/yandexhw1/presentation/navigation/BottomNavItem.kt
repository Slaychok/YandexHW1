package com.yandex.yandexhw1.presentation.navigation

import com.yandex.yandexhw1.R

data class BottomNavItem(
    val title: String,
    val route: String,
    val icon: Int
)

val items = listOf(
    BottomNavItem("Расходы", "expenses", R.drawable.expensesicon),
    BottomNavItem("Доходы", "incomes", R.drawable.incomeicon),
    BottomNavItem("Счет", "calculator", R.drawable.calculatoricon),
    BottomNavItem("Статьи", "articles", R.drawable.articlesicon),
    BottomNavItem("Настройки", "settings", R.drawable.settingsicon)
)