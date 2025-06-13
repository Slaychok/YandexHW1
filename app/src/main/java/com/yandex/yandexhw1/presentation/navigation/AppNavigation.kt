package com.yandex.yandexhw1.presentation.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.yandex.yandexhw1.presentation.navigation.bottomNavigation.BottomNavBar
import com.yandex.yandexhw1.presentation.ui.screens.ArticlesScreen
import com.yandex.yandexhw1.presentation.ui.screens.CalculatorScreen
import com.yandex.yandexhw1.presentation.ui.screens.ExpensesScreen
import com.yandex.yandexhw1.presentation.ui.screens.IncomesScreen
import com.yandex.yandexhw1.presentation.ui.screens.MainScreen
import com.yandex.yandexhw1.presentation.ui.screens.MyExpensesScreen
import com.yandex.yandexhw1.presentation.ui.screens.SettingsScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = { BottomNavBar(navController) }
    ) { padding ->
        NavHost(
            navController = navController,
            startDestination = "expenses",
            modifier = Modifier.padding(padding)
        ) {
            composable("expenses") { ExpensesScreen(navController) }
            composable("incomes") { IncomesScreen(navController) }
            composable("articles") { ArticlesScreen(navController) }
            composable("calculator") { CalculatorScreen(navController) }
            composable("settings") { SettingsScreen(navController) }
            composable("myExpenses") { MyExpensesScreen(navController) }
            composable("main") { MainScreen(navController) }
        }
    }
}