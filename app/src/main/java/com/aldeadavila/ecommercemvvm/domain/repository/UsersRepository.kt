package com.aldeadavila.ecommercemvvm.domain.repository

import com.aldeadavila.ecommercemvvm.domain.model.User
import com.aldeadavila.ecommercemvvm.domain.util.Resource

interface UsersRepository {

    suspend fun update(id: String, user: User): Resource<User>
}