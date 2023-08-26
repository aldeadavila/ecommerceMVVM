package com.aldeadavila.ecommercemvvm.ui.navigation.graph.admin

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.aldeadavila.ecommercemvvm.ui.navigation.Graph
import com.aldeadavila.ecommercemvvm.ui.navigation.graph.profile.ProfileNavGraph
import com.aldeadavila.ecommercemvvm.ui.navigation.screen.admin.AdminScreen
import com.aldeadavila.ecommercemvvm.ui.screens.admin.category.list.AdminCategoryListScreen
import com.aldeadavila.ecommercemvvm.ui.screens.admin.product.list.AdminProductListScreen
import com.aldeadavila.ecommercemvvm.ui.screens.profile.info.ProfileScreen

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
            AdminCategoryListScreen(navController)
        }

        composable(route = AdminScreen.Profile.route) {
            ProfileScreen(navController)
        }

        ProfileNavGraph(navController)
        AdminCategoryNavGraph(navController)
    }
}