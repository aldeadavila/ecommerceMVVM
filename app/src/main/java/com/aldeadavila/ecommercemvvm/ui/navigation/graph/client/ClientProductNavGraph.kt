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
import com.aldeadavila.ecommercemvvm.ui.navigation.screen.client.ClientProductScreen
import com.aldeadavila.ecommercemvvm.ui.screens.admin.category.update.AdminCategoryUpdateScreen
import com.aldeadavila.ecommercemvvm.ui.screens.admin.category.create.AdminCategoryCreateScreen
import com.aldeadavila.ecommercemvvm.ui.screens.admin.product.create.AdminProductCreateScreen
import com.aldeadavila.ecommercemvvm.ui.screens.admin.product.list.AdminProductListScreen
import com.aldeadavila.ecommercemvvm.ui.screens.admin.product.update.AdminProductUpdateScreen
import com.aldeadavila.ecommercemvvm.ui.screens.client.product.detail.ClientProductDetailScreen
import com.aldeadavila.ecommercemvvm.ui.screens.client.product.listbycategory.ClientProductListByCategoryScreen

fun NavGraphBuilder.ClientProudctNavGraph(navHostController: NavHostController) {
    navigation(
        route = Graph.CLIENT_PRODUCT,
        startDestination = ClientProductScreen.ProductDetail.route
    ) {

        composable(
            route = ClientProductScreen.ProductDetail.route,
            arguments = listOf(navArgument("product") {
                type = NavType.StringType
            })
        ) {
            it.arguments?.getString("product")?.let {
                ClientProductDetailScreen(navHostController, it)
            }
        }
    }
}