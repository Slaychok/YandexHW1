package com.yandex.yandexhw1.presentation.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.yandex.yandexhw1.R
import com.yandex.yandexhw1.domain.Income
import com.yandex.yandexhw1.presentation.ui.screens.formatNumber

@Composable
fun IncomeItem(income: Income) {
    ListItem(
        leftTitle = income.category,
        leftSubtitle = income.comment,
        rightTitle = formatNumber(income.amount),
        rightIcon = ImageVector.vectorResource(R.drawable.light_arrow)
    )
}