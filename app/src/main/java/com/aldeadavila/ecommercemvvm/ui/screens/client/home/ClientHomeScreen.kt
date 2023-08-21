package com.aldeadavila.ecommercemvvm.ui.screens.client.home

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.aldeadavila.ecommercemvvm.ui.navigation.graph.ClientNavGraph
import com.aldeadavila.ecommercemvvm.ui.screens.client.home.components.ClientBottomBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ClientHomeScreen(navHostController: NavHostController = rememberNavController()
) {
    Scaffold (
        bottomBar = {
            ClientBottomBar(navHostController = navHostController)
        }
    ){ paddingValues ->
        ClientNavGraph(navController = navHostController)
    }

}