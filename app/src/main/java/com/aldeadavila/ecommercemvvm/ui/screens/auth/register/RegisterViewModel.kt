package com.aldeadavila.ecommercemvvm.ui.screens.auth.register

import android.util.Patterns
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aldeadavila.ecommercemvvm.domain.model.AuthResponse
import com.aldeadavila.ecommercemvvm.domain.model.User
import com.aldeadavila.ecommercemvvm.domain.usecase.auth.AuthUseCase
import com.aldeadavila.ecommercemvvm.domain.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(private val authUseCase: AuthUseCase): ViewModel() {

    var state by mutableStateOf(RegisterState())
        private set

    var errorMessage by mutableStateOf("")

    var registerResponse by mutableStateOf<Resource<AuthResponse>?>(null)
        private set

    fun saveSession(authResponse: AuthResponse) = viewModelScope.launch {
        authUseCase.saveSession(authResponse)
    }

    fun register() = viewModelScope.launch {
        if (isValidateForm()) {
            val user = User(
                name = state.name,
                lastname = state.lastname,
                phone = state.phone,
                email = state.email,
                password = state.password
            )
            registerResponse = Resource.Loading
            val result = authUseCase.register(user)
            registerResponse = result
        }
    }

    fun onNameInput(input: String) {
        state = state.copy(name = input)
    }

    fun onLastNameInput(input: String) {
        state = state.copy(lastname = input)
    }

    fun onEmailInput(input: String) {
        state = state.copy(email = input)
    }

    fun onPhoneInput(input: String) {
        state = state.copy(phone = input)
    }

    fun onPasswordInput(input: String) {
        state = state.copy(password = input)
    }

    fun onConfirmPasswordInput(input: String) {
        state = state.copy(confirmPassword = input)
    }

    fun isValidateForm(): Boolean {

        if (state.name == "") {
            errorMessage = "Ingrese el nombre"
            return false
        }

        else if (state.lastname == "") {
            errorMessage = "Ingrese los apellidos"
            return false
        }

        else if (state.email == "") {
            errorMessage = "Ingrese el email"
            return false
        }

        else if (state.phone == "") {
            errorMessage = "Ingrese el teléfono"
            return false
        }

        else if (state.password == "") {
            errorMessage = "Ingrese la contraseña"
            return false
        }
        else if (state.confirmPassword == "") {
            errorMessage = "Ingrese la confirmación del password"
            return false
        }

        else if (state.confirmPassword != state.password) {
            errorMessage = "Las contraseñas no coinciden"
            return false
        }

        else if (!Patterns.EMAIL_ADDRESS.matcher(state.email).matches()) {
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