package com.aldeadavila.ecommercemvvm.ui.navigation.graph.client

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.aldeadavila.ecommercemvvm.ui.navigation.Graph
import com.aldeadavila.ecommercemvvm.ui.navigation.graph.profile.ProfileNavGraph
import com.aldeadavila.ecommercemvvm.ui.navigation.screen.client.ClientScreen
import com.aldeadavila.ecommercemvvm.ui.screens.client.category.list.ClientCategoryListScreen
import com.aldeadavila.ecommercemvvm.ui.screens.client.product.list.ClientProductListScreen
import com.aldeadavila.ecommercemvvm.ui.screens.profile.info.ProfileScreen

@Composable
fun ClientNavGraph(navController: NavHostController) {
    NavHost(navController = navController,
        route = Graph.CLIENT,
        startDestination = ClientScreen.ProductList.route
    ) {
        composable(route = ClientScreen.ProductList.route) {
            ClientProductListScreen()
        }

        composable(route = ClientScreen.CategoryList.route) {
            ClientCategoryListScreen(navController)
        }

        composable(route = ClientScreen.Profile.route) {
            ProfileScreen(navController)
        }

       ProfileNavGraph(navController)
    }
}