package com.aldeadavila.ecommercemvvm.ui.components

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.aldeadavila.ecommercemvvm.domain.util.Resource
import com.aldeadavila.ecommercemvvm.ui.navigation.screen.AuthScreen
import com.aldeadavila.ecommercemvvm.ui.screens.auth.login.LoginViewModel

@Composable
fun Login(navController: NavHostController, vm: LoginViewModel = hiltViewModel()) {

    when(val response = vm.loginResource) {
        Resource.Loading -> {
            Box(modifier = Modifier
                .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator()
            }
        }
        is Resource.Succes -> {
            LaunchedEffect(Unit) {
                navController.navigate(route = AuthScreen.Home.route)
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