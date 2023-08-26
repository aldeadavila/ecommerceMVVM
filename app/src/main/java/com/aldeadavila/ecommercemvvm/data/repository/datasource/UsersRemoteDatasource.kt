package com.aldeadavila.ecommercemvvm.data.repository.datasource

import com.aldeadavila.ecommercemvvm.domain.model.User
import retrofit2.Response

interface UsersRemoteDatasource {
    suspend fun update(id: String, user: User): Response<User>

}