package com.aldeadavila.ecommercemvvm.ui.screens.profile.update

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.aldeadavila.ecommercemvvm.ui.components.DefaultTopBar
import com.aldeadavila.ecommercemvvm.ui.screens.profile.info.components.ProfileContent
import com.aldeadavila.ecommercemvvm.ui.screens.profile.update.components.ProfileUpdateContent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileUpdateScreen(navController: NavHostController) {
    Scaffold (
            topBar = { DefaultTopBar(
            title = "Actualizar perfil",
            navController = navController,
            upAvailable = true
        )}
    ) {
        ProfileUpdateContent(paddingValues = it)
    }
}