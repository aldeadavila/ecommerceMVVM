package com.aldeadavila.ecommercemvvm.domain.usecase.auth

import com.aldeadavila.ecommercemvvm.domain.model.AuthResponse
import com.aldeadavila.ecommercemvvm.domain.repository.AuthRepository

class SaveSessionUseCase constructor(private val authRepository: AuthRepository) {
    suspend operator fun invoke(authResponse: AuthResponse) = authRepository.saveSession(authResponse)
}