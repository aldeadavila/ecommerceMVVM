package com.aldeadavila.ecommercemvvm.ui.screens.admin.product.create

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.aldeadavila.ecommercemvvm.ui.components.DefaultTopBar
import com.aldeadavila.ecommercemvvm.ui.screens.admin.product.create.components.AdminProductCreateContent
import com.aldeadavila.ecommercemvvm.ui.screens.admin.product.create.components.CreateProduct
import com.aldeadavila.ecommercemvvm.ui.screens.admin.product.list.components.AdminProductListContent
import com.aldeadavila.ecommercemvvm.ui.theme.Gray200

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AdminProductCreateScreen(navHostController: NavHostController, categoryParam: String) {

    Scaffold (
        topBar = {
            DefaultTopBar(
                title = "Nuevo Producto",
                upAvailable = true,
                navController = navHostController
            )
        },
        containerColor = Gray200
    ) {
        AdminProductCreateContent(paddingValues = it)
    }
    CreateProduct()
}