package com.aldeadavila.ecommercemvvm.ui.navigation.graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.aldeadavila.ecommercemvvm.ui.navigation.Graph
import com.aldeadavila.ecommercemvvm.ui.navigation.screen.ClientScreen
import com.aldeadavila.ecommercemvvm.ui.navigation.screen.RolesScreen
import com.aldeadavila.ecommercemvvm.ui.screens.client.category.list.ClientCategoryListScreen
import com.aldeadavila.ecommercemvvm.ui.screens.client.product.list.ClientProductListScreen
import com.aldeadavila.ecommercemvvm.ui.screens.profile.ProfileScreen
import com.aldeadavila.ecommercemvvm.ui.screens.roles.RolesScreen

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
            ClientCategoryListScreen()
        }

        composable(route = ClientScreen.Profile.route) {
            ProfileScreen()
        }
    }
}