package com.aldeadavila.ecommercemvvm.ui.screens.auth.register

import android.util.Patterns
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(): ViewModel() {

    var state by mutableStateOf(RegisterState())
        private set

    var errorMessage by mutableStateOf("")
        private set

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

    fun validateForm() = viewModelScope.launch {

        if (state.name == "") {
            errorMessage = "Ingrese el nombre"
        }

        else if (state.lastname == "") {
            errorMessage = "Ingrese los apellidos"
        }

        else if (state.email == "") {
            errorMessage = "Ingrese el email"
        }

        else if (state.phone == "") {
            errorMessage = "Ingrese el teléfono"
        }

        else if (state.password == "") {
            errorMessage = "Ingrese la contraseña"
        }
        else if (state.confirmPassword == "") {
            errorMessage = "Ingrese la confirmación del password"
        }

        else if (state.confirmPassword != state.password) {
            errorMessage = "Las contraseñas no coinciden"
        }

        else if (!Patterns.EMAIL_ADDRESS.matcher(state.email).matches()) {
            errorMessage = "El email no es válido"
        }

        else if (state.password.length < 6) {
            errorMessage = "La contraseña es menor de 6 caracteres"
        }

        delay(3000)

        errorMessage = ""
    }


}