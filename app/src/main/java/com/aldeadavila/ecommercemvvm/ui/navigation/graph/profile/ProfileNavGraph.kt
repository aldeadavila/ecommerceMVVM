package com.aldeadavila.ecommercemvvm.ui.navigation.graph.profile

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.aldeadavila.ecommercemvvm.ui.navigation.Graph
import com.aldeadavila.ecommercemvvm.ui.navigation.screen.profile.ProfileScreen
import com.aldeadavila.ecommercemvvm.ui.screens.profile.update.ProfileUpdateScreen

fun NavGraphBuilder.ProfileNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.PROFILE,
        startDestination = ProfileScreen.ProfileUpdate.route
    ) {

        composable(route = ProfileScreen.ProfileUpdate.route) {
            ProfileUpdateScreen(navController)
        }

    }
}