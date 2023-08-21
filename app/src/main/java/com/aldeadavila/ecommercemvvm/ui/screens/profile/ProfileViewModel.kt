package com.aldeadavila.ecommercemvvm.ui.screens.profile

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aldeadavila.ecommercemvvm.domain.usecase.auth.AuthUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(private val authUseCase: AuthUseCase): ViewModel() {

    fun logout() = viewModelScope.launch {
        authUseCase.logout()
    }
}