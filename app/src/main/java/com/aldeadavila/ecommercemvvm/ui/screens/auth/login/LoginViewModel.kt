package com.aldeadavila.ecommercemvvm.ui.screens.auth.login

import android.util.Log
import android.util.Patterns
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aldeadavila.ecommercemvvm.domain.model.AuthResponse
import com.aldeadavila.ecommercemvvm.domain.usecase.auth.AuthUseCase
import com.aldeadavila.ecommercemvvm.domain.util.Response
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(private val authUseCase: AuthUseCase): ViewModel() {

    var state by mutableStateOf(LoginState())
        private set

    var errorMessage by mutableStateOf("")
        private set

    // LOGIN RESPONSE
    var loginResponse by mutableStateOf<Response<AuthResponse>?>(null)
        private set

    fun login() = viewModelScope.launch {
        if (isValidateForm()) {
            loginResponse = Response.Loading //esperando respuesta
            val result = authUseCase.login(state.email, state.password) // devuelve la respuesta

            loginResponse = result // respuesta exitosa o errónea
            Log.d("LoginViewModel", "Response guay: ${loginResponse}")
        }
    }

    fun onEmailInput(email: String) {
        state = state.copy(email = email)
    }

    fun onPasswordInput(password: String) {
        state = state.copy(password = password)
    }

    fun isValidateForm(): Boolean  {
        if (!Patterns.EMAIL_ADDRESS.matcher(state.email).matches()) {
            errorMessage = "El email no es válido"
            return false
        }

         else if (state.password.length < 6) {
            errorMessage = "La contraseña es menor de 6 caracteres"
            return false
        }

        return true
    }
}