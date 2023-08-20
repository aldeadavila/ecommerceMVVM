package com.aldeadavila.ecommercemvvm.domain.repository

import com.aldeadavila.ecommercemvvm.domain.model.AuthResponse
import com.aldeadavila.ecommercemvvm.domain.model.User
import com.aldeadavila.ecommercemvvm.domain.util.Resource

interface AuthRepository {

    suspend fun login(email:String, password:String): Resource<AuthResponse>

    suspend fun register(user: User): Resource<AuthResponse>
}