package com.aldeadavila.ecommercemvvm.ui.screens.client.category.list

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.aldeadavila.ecommercemvvm.ui.screens.client.category.list.components.GetCategories
import com.aldeadavila.ecommercemvvm.ui.screens.profile.components.ClientCategoryListContent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ClientCategoryListScreen(navHostController: NavHostController,) {
    Scaffold {
        GetCategories(paddingValues = it, navHostController = navHostController )
    }
}