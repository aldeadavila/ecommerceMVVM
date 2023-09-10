package com.aldeadavila.ecommercemvvm.ui.navigation.graph.client

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.aldeadavila.ecommercemvvm.ui.navigation.Graph
import com.aldeadavila.ecommercemvvm.ui.navigation.screen.admin.AdminCategoryScreen
import com.aldeadavila.ecommercemvvm.ui.navigation.screen.client.ClientCategoryScreen
import com.aldeadavila.ecommercemvvm.ui.screens.admin.category.update.AdminCategoryUpdateScreen
import com.aldeadavila.ecommercemvvm.ui.screens.admin.category.create.AdminCategoryCreateScreen
import com.aldeadavila.ecommercemvvm.ui.screens.admin.product.create.AdminProductCreateScreen
import com.aldeadavila.ecommercemvvm.ui.screens.admin.product.list.AdminProductListScreen
import com.aldeadavila.ecommercemvvm.ui.screens.admin.product.update.AdminProductUpdateScreen
import com.aldeadavila.ecommercemvvm.ui.screens.client.product.listbycategory.ClientProductListByCategoryScreen

fun NavGraphBuilder.ClientCategoryNavGraph(navHostController: NavHostController) {
    navigation(
        route = Graph.CLIENT_CATEGORY,
        startDestination = ClientCategoryScreen.ProductList.route
    ) {

        composable(
            route = ClientCategoryScreen.ProductList.route,
            arguments = listOf(navArgument("category") {
                type = NavType.StringType
            })
        ) {
            it.arguments?.getString("category")?.let {
                ClientProductListByCategoryScreen(navHostController, it)
            }
        }

    }
}