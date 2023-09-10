package com.aldeadavila.ecommercemvvm.ui.screens.client.product.listbycategory

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.aldeadavila.ecommercemvvm.domain.model.Category
import com.aldeadavila.ecommercemvvm.ui.components.DefaultTopBar
import com.aldeadavila.ecommercemvvm.ui.navigation.screen.admin.AdminCategoryScreen
import com.aldeadavila.ecommercemvvm.ui.screens.admin.product.list.components.DeleteProduct
import com.aldeadavila.ecommercemvvm.ui.screens.admin.product.list.components.GetProducts
import com.aldeadavila.ecommercemvvm.ui.screens.client.product.listbycategory.components.GetProductsByCategory

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ClientProductListByCategoryScreen(navHostController: NavHostController, categoryParam: String) {

    val categoryParse = Category.fromJson(categoryParam).toJson()

    Scaffold (
        topBar = {
                 DefaultTopBar(
                     title = "Productos",
                     navController  = navHostController,
                     upAvailable = true

                 )
        },
    ) {
        GetProductsByCategory(navHostController = navHostController, paddingValues = it)
    }

}