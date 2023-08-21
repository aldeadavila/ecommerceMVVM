package com.aldeadavila.ecommercemvvm.ui.screens.admin.category.list

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.aldeadavila.ecommercemvvm.ui.screens.admin.category.list.components.AdminScreenCategoryListContent
import com.aldeadavila.ecommercemvvm.ui.screens.profile.components.ClientCategoryListContent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AdminCategoryListScreen() {
    Scaffold {
        AdminScreenCategoryListContent(paddingValues = it)
    }
}