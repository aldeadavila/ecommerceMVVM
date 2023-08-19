package com.aldeadavila.ecommercemvvm.data.repository

import com.aldeadavila.ecommercemvvm.data.repository.datasource.AuthRemoteDatasource
import com.aldeadavila.ecommercemvvm.domain.model.AuthResponse
import com.aldeadavila.ecommercemvvm.domain.repository.AuthRepository
import com.aldeadavila.ecommercemvvm.domain.util.Response

class AuthRepositoryImpl(private val authRemoteDatasource: AuthRemoteDatasource): AuthRepository {
    override suspend fun login(email: String, password: String): Response<AuthResponse> {
        return try {
            val result = authRemoteDatasource.login(email, password)
            Response.Succes(result.body()!!)
        } catch (e: Exception) {
            e.printStackTrace()
            Response.Failure(e)
        }
    }

}