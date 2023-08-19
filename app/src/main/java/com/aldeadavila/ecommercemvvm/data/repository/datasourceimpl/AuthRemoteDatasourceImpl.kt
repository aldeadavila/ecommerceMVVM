package com.aldeadavila.ecommercemvvm.data.repository.datasourceimpl

import com.aldeadavila.ecommercemvvm.data.repository.datasource.AuthRemoteDatasource
import com.aldeadavila.ecommercemvvm.data.service.AuthService

class AuthRemoteDatasourceImpl(private val authService: AuthService): AuthRemoteDatasource {
    override suspend fun login(email:String, password: String) = authService.login(email, password)
}