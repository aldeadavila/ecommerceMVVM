package com.aldeadavila.ecommercemvvm.data.datasource.remote

import com.aldeadavila.ecommercemvvm.data.datasource.remote.AuthRemoteDatasource
import com.aldeadavila.ecommercemvvm.data.datasource.remote.service.AuthService
import com.aldeadavila.ecommercemvvm.domain.model.AuthResponse
import com.aldeadavila.ecommercemvvm.domain.model.User
import retrofit2.Response

class AuthRemoteDatasourceImpl(private val authService: AuthService): AuthRemoteDatasource {
    override suspend fun login(email:String, password: String) = authService.login(email, password)
    override suspend fun register(user: User): Response<AuthResponse> = authService.register(user)
}