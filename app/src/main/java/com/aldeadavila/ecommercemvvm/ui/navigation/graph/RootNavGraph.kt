package com.aldeadavila.ecommercemvvm.ui.navigation.graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.aldeadavila.ecommercemvvm.ui.navigation.Graph

@Composable
fun RootNavGraph(navController: NavHostController) {
    NavHost(navController = navController,
        route = Graph.ROOT,
        startDestination = Graph.AUTH
    ) {
        AuthNavGraph(navController = navController)
        RolesNavGraph(navController = navController)
    }
}