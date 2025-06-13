package com.yandex.yandexhw1.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.yandex.yandexhw1.presentation.navigation.AppNavigation
import com.yandex.yandexhw1.presentation.ui.theme.YandexHW1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            YandexHW1Theme {
                AppNavigation()
            }
        }
    }
}