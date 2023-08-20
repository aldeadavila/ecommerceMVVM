package com.aldeadavila.ecommercemvvm.ui.screens.auth.register.components

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.aldeadavila.ecommercemvvm.domain.util.Resource
import com.aldeadavila.ecommercemvvm.ui.components.ProgressBar
import com.aldeadavila.ecommercemvvm.ui.navigation.screen.AuthScreen
import com.aldeadavila.ecommercemvvm.ui.screens.auth.register.RegisterViewModel

@Composable
fun Register(navHostController: NavHostController, vm: RegisterViewModel = hiltViewModel()) {

    when(val response = vm.registerResponse) {
        Resource.Loading -> {
            ProgressBar()
        }
        is Resource.Succes -> {
            LaunchedEffect(Unit) {
                navHostController.navigate(route = AuthScreen.Home.route)
            }
        }

        is Resource.Failure -> {
            Toast.makeText(LocalContext.current, response.message, Toast.LENGTH_SHORT).show()
        }

        else -> {
            if(response != null) {
                Toast.makeText(LocalContext.current, "Hubo un error desconocido", Toast.LENGTH_SHORT).show()
            }
        }
    }
}