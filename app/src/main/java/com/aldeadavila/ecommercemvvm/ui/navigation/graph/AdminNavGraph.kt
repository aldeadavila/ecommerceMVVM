package com.aldeadavila.ecommercemvvm.ui.navigation.graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.aldeadavila.ecommercemvvm.ui.navigation.Graph
import com.aldeadavila.ecommercemvvm.ui.navigation.screen.AdminScreen
import com.aldeadavila.ecommercemvvm.ui.screens.admin.category.list.AdminCategoryListScreen
import com.aldeadavila.ecommercemvvm.ui.screens.admin.product.list.AdminProductListScreen
import com.aldeadavila.ecommercemvvm.ui.screens.profile.ProfileScreen

@Composable
fun AdminNavGraph(navController: NavHostController) {
    NavHost(navController = navController,
        route = Graph.ADMIN,
        startDestination = AdminScreen.ProductList.route
    ) {
        composable(route = AdminScreen.ProductList.route) {
            AdminProductListScreen()
        }

        composable(route = AdminScreen.CategoryList.route) {
            AdminCategoryListScreen()
        }

        composable(route = AdminScreen.Profile.route) {
            ProfileScreen()
        }
    }
}