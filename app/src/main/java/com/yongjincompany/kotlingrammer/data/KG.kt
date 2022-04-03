package com.yongjincompany.kotlingrammer.data

data class KG(
    val id: Int,
    val title: String,
    val important: String,
    val Level: Int,
    val description: String,
    val KotlinImageId: Int = 0
)
