package com.yandex.yandexhw1.presentation.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.yandex.yandexhw1.R
import com.yandex.yandexhw1.domain.Expense
import com.yandex.yandexhw1.presentation.ui.screens.formatNumber

@Composable
fun ExpenseItem(expense: Expense) {
    ListItem(
        leftTitle = expense.category,
        leftSubtitle = expense.comment,
        rightTitle = formatNumber(expense.amount),
        leftIcon = expense.image,
        rightIcon = ImageVector.vectorResource(R.drawable.light_arrow)
    )
}