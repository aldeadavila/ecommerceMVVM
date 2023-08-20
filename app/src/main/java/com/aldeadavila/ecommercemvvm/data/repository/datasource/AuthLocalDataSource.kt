package com.aldeadavila.ecommercemvvm.data.repository.datasource

import com.aldeadavila.ecommercemvvm.domain.model.AuthResponse
import kotlinx.coroutines.flow.Flow

interface AuthLocalDataSource {

    suspend fun saveSession(authResponse: AuthResponse)
    fun getSessionData(): Flow<AuthResponse>
}