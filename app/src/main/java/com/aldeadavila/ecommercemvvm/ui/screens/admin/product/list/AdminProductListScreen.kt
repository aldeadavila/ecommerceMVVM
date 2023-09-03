package com.aldeadavila.ecommercemvvm.ui.screens.admin.product.list

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
import com.aldeadavila.ecommercemvvm.ui.navigation.Graph
import com.aldeadavila.ecommercemvvm.ui.navigation.screen.admin.AdminCategoryScreen
import com.aldeadavila.ecommercemvvm.ui.screens.admin.product.list.components.AdminProductListContent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AdminProductListScreen(navHostController: NavHostController, categoryParam: String) {

    val categoryParse = Category.fromJson(categoryParam).toJson()

    Scaffold (
        floatingActionButton = {
            FloatingActionButton(
                modifier = Modifier.padding(bottom = 20.dp),
                onClick = { navHostController.navigate(route = AdminCategoryScreen.ProductCreate.passCategory(categoryParse)) },
                containerColor = Color.DarkGray
            )
            {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "",
                    tint = Color.White
                )
            }
        }
    ) {
        AdminProductListContent(paddingValues = it)
    }
}