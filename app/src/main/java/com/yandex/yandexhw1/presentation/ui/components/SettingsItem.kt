package com.yandex.yandexhw1.presentation.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.yandex.yandexhw1.R
import com.yandex.yandexhw1.domain.Settings

@Composable
fun SettingsItem(settings: Settings) {
    ListItem(
        leftTitle = settings.name,
        rightIcon = ImageVector.vectorResource(R.drawable.dark_arrow),
        listHeight = 56
    )
}