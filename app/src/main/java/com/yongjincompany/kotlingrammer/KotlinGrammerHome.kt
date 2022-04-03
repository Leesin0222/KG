package com.yongjincompany.kotlingrammer

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.yongjincompany.kotlingrammer.data.DataProvider


@Composable
fun KotlinGrammerHomeContent(){
    val kgs = remember { DataProvider.kgList }
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 0.dp)
    ) {
        items(
            items = kgs,
            itemContent = {
                KGListItem(kg = it)
            }
        )
    }
}