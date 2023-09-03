package com.aldeadavila.ecommercemvvm.ui.navigation.screen.admin

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.ui.graphics.vector.ImageVector

sealed class AdminScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object CategoryList: AdminScreen(
        route = "admin/category/list",
        title = "Categorías",
        icon = Icons.Default.List
    )

   /* object ProductList: AdminScreen(
        route = "admin/product/list",
        title = "Productos",
        icon = Icons.Default.ThumbUp
    )*/

    object Profile: AdminScreen(
        route = "admin/profile",
        title = "Perfíl",
        icon = Icons.Default.Person
    )

}
