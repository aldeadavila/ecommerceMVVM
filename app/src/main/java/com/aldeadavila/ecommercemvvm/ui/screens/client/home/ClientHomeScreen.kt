package com.aldeadavila.ecommercemvvm.ui.screens.client.home

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ClientHomeScreen(navHostController: NavHostController) {
    Scaffold {
        Text(
            modifier = Modifier
                .padding(paddingValues = it),
            text = "CLIENT HomeScreen")
    }

}