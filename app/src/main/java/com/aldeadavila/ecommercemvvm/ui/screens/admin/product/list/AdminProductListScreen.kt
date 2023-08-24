package com.aldeadavila.ecommercemvvm.ui.screens.admin.product.list

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.aldeadavila.ecommercemvvm.ui.screens.admin.product.list.components.AdminProductListContent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AdminProductListScreen() {
    Scaffold {
        AdminProductListContent(paddingValues = it)
    }
}