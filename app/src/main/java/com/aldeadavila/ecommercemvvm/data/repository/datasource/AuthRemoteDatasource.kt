package com.aldeadavila.ecommercemvvm.data.repository.datasource

import com.aldeadavila.ecommercemvvm.domain.model.AuthResponse
import com.aldeadavila.ecommercemvvm.domain.model.User
import retrofit2.Response

interface AuthRemoteDatasource {

    suspend fun login(email:String, password:String): Response<AuthResponse>
    suspend fun register(user: User): Response<AuthResponse>

}