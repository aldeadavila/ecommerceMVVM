package com.aldeadavila.ecommercemvvm.ui.navigation.graph.auth

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.aldeadavila.ecommercemvvm.ui.navigation.Graph
import com.aldeadavila.ecommercemvvm.ui.navigation.screen.auth.AuthScreen
import com.aldeadavila.ecommercemvvm.ui.screens.auth.login.LoginScreen
import com.aldeadavila.ecommercemvvm.ui.screens.auth.register.RegisterScreen

fun NavGraphBuilder.AuthNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.AUTH,
        startDestination = AuthScreen.Login.route
    ) {
        composable(route = AuthScreen.Login.route) {
            LoginScreen(navController)
        }

        composable(route = AuthScreen.Register.route) {
            RegisterScreen(navController)
        }

    }
}