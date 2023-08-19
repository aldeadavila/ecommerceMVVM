package com.aldeadavila.ecommercemvvm.domain.usecase.auth

import com.aldeadavila.ecommercemvvm.domain.repository.AuthRepository

class LoginUseCase(private val authRepository: AuthRepository) {

    suspend operator fun invoke(email: String, password: String) = authRepository.login(email, password)
}