package com.aldeadavila.ecommercemvvm.ui.screens.auth.login

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.aldeadavila.ecommercemvvm.ui.screens.auth.login.components.LoginContent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavHostController) {
    Scaffold() { paddingValues ->
            LoginContent(navController = navController, paddingValues)
    }
}