package com.aldeadavila.ecommercemvvm.data.repository.datasource

import com.aldeadavila.ecommercemvvm.domain.model.User
import com.aldeadavila.ecommercemvvm.domain.util.Resource
import retrofit2.Response
import java.io.File

interface UsersRemoteDatasource {
    suspend fun update(id: String, user: User): Response<User>

    suspend fun updateWithImage(id: String, user: User, file: File): Response<User>


}