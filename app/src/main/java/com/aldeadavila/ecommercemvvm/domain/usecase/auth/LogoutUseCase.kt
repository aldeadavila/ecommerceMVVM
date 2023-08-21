package com.aldeadavila.ecommercemvvm.domain.usecase.auth

import com.aldeadavila.ecommercemvvm.domain.model.AuthResponse
import com.aldeadavila.ecommercemvvm.domain.repository.AuthRepository

class LogoutUseCase constructor(private val authRepository: AuthRepository) {
    suspend operator fun invoke() = authRepository.logout()
}