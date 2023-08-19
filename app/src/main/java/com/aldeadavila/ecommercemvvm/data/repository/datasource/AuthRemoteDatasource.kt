package com.aldeadavila.ecommercemvvm.data.repository.datasource

import com.aldeadavila.ecommercemvvm.domain.model.AuthResponse
import retrofit2.Response

interface AuthRemoteDatasource {

    suspend fun login(email:String, password:String): Response<AuthResponse>
}