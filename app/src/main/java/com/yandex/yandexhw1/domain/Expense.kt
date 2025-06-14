package com.yandex.yandexhw1.domain

data class Expense(
    val id: Int,
    val category: String,
    val amount: Int,
    val image: String,
    val comment: String = ""
)