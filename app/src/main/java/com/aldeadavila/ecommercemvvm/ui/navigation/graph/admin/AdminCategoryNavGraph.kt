package com.aldeadavila.ecommercemvvm.ui.navigation.graph.admin

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.aldeadavila.ecommercemvvm.ui.navigation.Graph
import com.aldeadavila.ecommercemvvm.ui.navigation.screen.admin.AdminCategoryScreen
import com.aldeadavila.ecommercemvvm.ui.screens.admin.category.update.AdminCategoryUpdateScreen
import com.aldeadavila.ecommercemvvm.ui.screens.admin.category.create.AdminCategoryCreateScreen

fun NavGraphBuilder.AdminCategoryNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.ADMIN_CATEGORY,
        startDestination = AdminCategoryScreen.CategoryCreate.route
    ) {

        composable(route = AdminCategoryScreen.CategoryCreate.route) {
            AdminCategoryCreateScreen(navHostController = navController)
        }

        composable(
            route = AdminCategoryScreen.CategoryUpdate.route,
            arguments = listOf(navArgument("category") {
                type = NavType.StringType
            })
        ) {
            it.arguments?.getString("category").let {
                AdminCategoryUpdateScreen(navHostController = navController, it!!)
            }
        }

    }
}