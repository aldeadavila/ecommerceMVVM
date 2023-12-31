package com.aldeadavila.ecommercemvvm.ui.screens.auth.login.components

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.aldeadavila.ecommercemvvm.domain.util.Resource
import com.aldeadavila.ecommercemvvm.ui.components.ProgressBar
import com.aldeadavila.ecommercemvvm.ui.navigation.Graph
import com.aldeadavila.ecommercemvvm.ui.screens.auth.login.LoginViewModel

@Composable
fun Login(navController: NavHostController, vm: LoginViewModel = hiltViewModel()) {

    when(val response = vm.loginResource) {
        Resource.Loading -> {
            ProgressBar()
        }
        is Resource.Succes -> {
            vm.saveSession(response.data)

            LaunchedEffect(Unit) {

                if(response.data.user?.roles!!.size > 1) {
                    navController.navigate(route = Graph.ROLES) {
                        popUpTo(Graph.AUTH) { inclusive = true }
                    }
                } else { // usuario con un solo rol
                    navController.navigate(route = Graph.CLIENT) {
                        popUpTo(Graph.AUTH) { inclusive = true }
                    }
                }

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