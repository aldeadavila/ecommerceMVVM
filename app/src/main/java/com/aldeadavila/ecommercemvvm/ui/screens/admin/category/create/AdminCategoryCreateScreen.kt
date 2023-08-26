package com.aldeadavila.ecommercemvvm.ui.screens.admin.category.create

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.aldeadavila.ecommercemvvm.ui.components.DefaultTopBar
import com.aldeadavila.ecommercemvvm.ui.screens.admin.category.create.components.AdminCategoryCreateContent
import com.aldeadavila.ecommercemvvm.ui.theme.Gray200

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AdminCategoryCreateScreen(navHostController: NavHostController) {
    Scaffold (
        topBar = {
            DefaultTopBar(
                title = "Nueva Categoría",
                upAvailable = true,
                navController = navHostController
            )
        },
        containerColor = Gray200
    ){

        AdminCategoryCreateContent(paddingValues = it)
    }
}