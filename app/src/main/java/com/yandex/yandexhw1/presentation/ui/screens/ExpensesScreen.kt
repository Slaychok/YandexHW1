package com.yandex.yandexhw1.presentation.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.yandex.yandexhw1.presentation.ui.components.AddButton
import com.yandex.yandexhw1.presentation.ui.theme.BlackForFont

@Composable
fun ExpensesScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp)
    ) {
        // Заголовок
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = "Расходы сегодня",
                fontSize = 22.sp,
                color = BlackForFont,
                fontWeight = FontWeight.W400
            )
        }
        AddButton(onClick = { navController.navigate("myExpenses") })
    }
}

@Preview
@Composable
fun ExpensesScreenPreview(navController: NavController){
    ExpensesScreen(navController)
}