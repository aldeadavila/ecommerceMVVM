package com.aldeadavila.ecommercemvvm.domain.usecase.auth

import com.aldeadavila.ecommercemvvm.domain.model.User
import com.aldeadavila.ecommercemvvm.domain.repository.AuthRepository

class RegisterUseCase(private val authRepository: AuthRepository) {
    suspend operator fun invoke(user: User) = authRepository.register(user)
}
