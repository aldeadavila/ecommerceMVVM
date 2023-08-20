package com.aldeadavila.ecommercemvvm.ui.screens.roles

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.aldeadavila.ecommercemvvm.ui.components.DefaultTopBar
import com.aldeadavila.ecommercemvvm.ui.screens.roles.components.RolesContent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RolesScreen(navHostController: NavHostController) {

    Scaffold (
        topBar = { DefaultTopBar(title = "Selecciona un rol")}
    ){
        RolesContent(it, navHostController)
    }
}