package com.yandex.yandexhw1.presentation.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.yandex.yandexhw1.domain.Settings
import com.yandex.yandexhw1.presentation.ui.components.SettingsItem

@Composable
fun SettingsScreen(navController: NavController) {
    val settings = remember {
        listOf(
            Settings(id = 0, name = "Основной цвет"),
            Settings(id = 1, name = "Звуки"),
            Settings(id = 2, name = "Хаптики"),
            Settings(id = 3, name = "Код пароль"),
            Settings(id = 4, name = "Синхронизация"),
            Settings(id = 5, name = "Язык"),
            Settings(id = 6, name = "О программе")
        )
    }

    LazyColumn {
        item {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .padding(16.dp)
            ) {
                Text(
                    "Темная тема",
                    fontSize = 16.sp,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Switch(
                    checked = false,
                    onCheckedChange = {}
                )
            }
            HorizontalDivider()
        }
        items(settings) { item ->
            SettingsItem(item)
            HorizontalDivider()
        }
    }
}