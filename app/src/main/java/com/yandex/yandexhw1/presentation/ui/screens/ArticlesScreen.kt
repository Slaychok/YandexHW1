package com.yandex.yandexhw1.presentation.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.yandex.yandexhw1.R
import com.yandex.yandexhw1.domain.Article
import com.yandex.yandexhw1.presentation.ui.components.ArticleItem
@Composable
fun ArticlesScreen(navController: NavController) {
    val articles = remember {
        listOf(
            Article(id = 0, name = "Аренда квартиры", image = "\uD83C\uDFE1"),
            Article(id = 1, name = "Одежда", image = "\uD83D\uDC57"),
            Article(id = 2, name = "На собачку", image = "\uD83D\uDC36"),
            Article(id = 3, name = "На собачку", image = "\uD83D\uDC36"),
            Article(id = 4, name = "Ремонт квартиры", image = "РК"),
            Article(id = 5, name = "Продукты", image = "\uD83C\uDF6D"),
            Article(id = 6, name = "Спортзал", image = "\uD83C\uDFCB\uFE0F"),
            Article(id = 7, name = "Медицина", image = "\uD83D\uDC8A")
        )
    }

    LazyColumn {
        item {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .background(Color(0xFFECE6F0))
                    .padding(start = 4.dp)
            ) {
                TextField(
                    value = "",
                    onValueChange = {},
                    placeholder = {
                        Text(
                            "Найти статью",
                            color = Color(0xFF49454F)
                        )
                    },
                    trailingIcon = {
                        Icon(
                            ImageVector.vectorResource(R.drawable.search_icon),
                            contentDescription = "Найти",
                            modifier = Modifier.width(24.dp)
                        )
                    },
                    colors = TextFieldDefaults.colors(
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        focusedContainerColor = Color.Transparent,
                        unfocusedContainerColor = Color.Transparent,
                        disabledContainerColor = Color.Transparent
                    ),
                    modifier = Modifier.fillMaxWidth()
                )
            }
            HorizontalDivider()
        }
        items(articles) { article ->
            ArticleItem(article)
            HorizontalDivider()
        }
    }
}