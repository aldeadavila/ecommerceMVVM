package com.aldeadavila.ecommercemvvm.domain.repository

import com.aldeadavila.ecommercemvvm.domain.model.AuthResponse
import com.aldeadavila.ecommercemvvm.domain.util.Response

interface AuthRepository {

    suspend fun login(email:String, password:String): Response<AuthResponse>
}