package com.aldeadavila.ecommercemvvm.ui.navigation.graph.admin

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.aldeadavila.ecommercemvvm.ui.navigation.Graph
import com.aldeadavila.ecommercemvvm.ui.navigation.screen.admin.AdminCategoryScreen
import com.aldeadavila.ecommercemvvm.ui.navigation.screen.roles.RolesScreen
import com.aldeadavila.ecommercemvvm.ui.screens.admin.category.create.AdminCategoryCreateScreen
import com.aldeadavila.ecommercemvvm.ui.screens.admin.home.AdminHomeScreen
import com.aldeadavila.ecommercemvvm.ui.screens.client.home.ClientHomeScreen
import com.aldeadavila.ecommercemvvm.ui.screens.roles.RolesScreen

fun NavGraphBuilder.AdminCategoryNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.ADMIN_CATEGORY,
        startDestination = AdminCategoryScreen.CategoryCreate.route
    ) {

        composable(route = AdminCategoryScreen.CategoryCreate.route) {

            AdminCategoryCreateScreen(navController)
        }

    }
}