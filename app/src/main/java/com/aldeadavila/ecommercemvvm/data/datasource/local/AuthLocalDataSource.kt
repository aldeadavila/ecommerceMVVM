package com.aldeadavila.ecommercemvvm.data.datasource.local

import com.aldeadavila.ecommercemvvm.domain.model.AuthResponse
import com.aldeadavila.ecommercemvvm.domain.model.User
import kotlinx.coroutines.flow.Flow

interface AuthLocalDataSource {

    suspend fun saveSession(authResponse: AuthResponse)
    suspend fun updateSession(user: User)
    suspend fun logout()
    fun getSessionData(): Flow<AuthResponse>
}