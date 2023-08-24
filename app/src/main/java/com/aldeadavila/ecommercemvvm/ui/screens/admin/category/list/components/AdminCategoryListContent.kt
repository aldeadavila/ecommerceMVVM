package com.aldeadavila.ecommercemvvm.ui.screens.admin.category.list.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun AdminScreenCategoryListContent(paddingValues: PaddingValues) {
    Text(
        modifier = Modifier.padding(paddingValues),
        text = "Admin Category List")
}