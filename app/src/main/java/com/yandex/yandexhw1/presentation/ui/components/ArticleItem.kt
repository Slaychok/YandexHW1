package com.yandex.yandexhw1.presentation.ui.components

import androidx.compose.runtime.Composable
import com.yandex.yandexhw1.domain.Article

@Composable
fun ArticleItem(article: Article) {
    ListItem(
        leftTitle = article.name,
        leftIcon = article.image
    )
}