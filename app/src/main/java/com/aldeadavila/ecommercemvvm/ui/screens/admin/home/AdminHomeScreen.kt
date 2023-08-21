package com.aldeadavila.ecommercemvvm.ui.screens.admin.home

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.aldeadavila.ecommercemvvm.ui.navigation.graph.AdminNavGraph
import com.aldeadavila.ecommercemvvm.ui.screens.admin.home.components.AdminBottomBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AdminHomeScreen(navHostController: NavHostController = rememberNavController()) {
    Scaffold (
        bottomBar = { AdminBottomBar(navHostController = navHostController)}
    ){paddingValues  ->
        AdminNavGraph(navController = navHostController)
    }

}