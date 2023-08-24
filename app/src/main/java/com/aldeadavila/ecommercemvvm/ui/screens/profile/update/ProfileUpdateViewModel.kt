package com.aldeadavila.ecommercemvvm.ui.screens.profile.update

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aldeadavila.ecommercemvvm.domain.model.User
import com.aldeadavila.ecommercemvvm.domain.usecase.auth.AuthUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProfileUpdateViewModel @Inject constructor(
    private val authUseCase: AuthUseCase,
    private val savedStateHandle: SavedStateHandle
    ): ViewModel() {

    var state by mutableStateOf(ProfileUpdateState())

    //Arguments
    val data = savedStateHandle.get<String>("user")
    val user = User.fromJson(data!!)

    init {
        state = state.copy(
            name = user.name,
            lastname = user.lastname,
            phone = user.phone,
            image = user.image ?: ""
        )
    }

    fun onNameInput(input: String) {
        state = state.copy(name = input)
    }

    fun onLastNameInput(input: String) {
        state = state.copy(lastname = input)
    }

    fun onImageInput(input: String) {
        state = state.copy(image = input)
    }

    fun onPhoneInput(input: String) {
        state = state.copy(phone = input)
    }

}