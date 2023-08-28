package com.aldeadavila.ecommercemvvm.data.repository

import com.aldeadavila.ecommercemvvm.data.datasource.local.AuthLocalDataSource
import com.aldeadavila.ecommercemvvm.data.datasource.remote.AuthRemoteDatasource
import com.aldeadavila.ecommercemvvm.domain.model.AuthResponse
import com.aldeadavila.ecommercemvvm.domain.model.User
import com.aldeadavila.ecommercemvvm.domain.repository.AuthRepository
import com.aldeadavila.ecommercemvvm.domain.util.Resource
import com.aldeadavila.ecommercemvvm.domain.util.ResponseToRequest
import kotlinx.coroutines.flow.Flow

class AuthRepositoryImpl(
    private val authRemoteDatasource: AuthRemoteDatasource,
    private val authLocalDataSource: AuthLocalDataSource
    ): AuthRepository {
    override suspend fun login(email: String, password: String): Resource<AuthResponse> = ResponseToRequest.send(
        authRemoteDatasource.login(email, password)
    )

    override suspend fun register(user: User): Resource<AuthResponse> = ResponseToRequest.send(
        authRemoteDatasource.register(user)
    )

    override suspend fun saveSession(authResponse: AuthResponse) = authLocalDataSource.saveSession(authResponse)
    override suspend fun updateSession(user: User) = authLocalDataSource.updateSession(user)

    override suspend fun logout() = authLocalDataSource.logout()

    override fun getSessionData(): Flow<AuthResponse> = authLocalDataSource.getSessionData()
}