package com.aldeadavila.ecommercemvvm.ui.navigation.graph.roles

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.aldeadavila.ecommercemvvm.ui.navigation.Graph
import com.aldeadavila.ecommercemvvm.ui.navigation.screen.roles.RolesScreen
import com.aldeadavila.ecommercemvvm.ui.screens.admin.home.AdminHomeScreen
import com.aldeadavila.ecommercemvvm.ui.screens.client.home.ClientHomeScreen
import com.aldeadavila.ecommercemvvm.ui.screens.roles.RolesScreen

fun NavGraphBuilder.RolesNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.ROLES,
        startDestination = RolesScreen.Roles.route
    ) {

        composable(route = RolesScreen.Roles.route) {
            RolesScreen(navController)
        }

        composable(route = Graph.CLIENT) {
            ClientHomeScreen()
        }

        composable(route = Graph.ADMIN) {
            AdminHomeScreen()
        }

    }
}