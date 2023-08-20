package com.aldeadavila.ecommercemvvm.domain.usecase.auth

import com.aldeadavila.ecommercemvvm.domain.repository.AuthRepository

class GetSessionDataUseCase constructor(private val authRepository: AuthRepository) {
    operator fun invoke() = authRepository.getSessionData()
}