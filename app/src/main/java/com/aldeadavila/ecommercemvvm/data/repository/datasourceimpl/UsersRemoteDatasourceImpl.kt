package com.aldeadavila.ecommercemvvm.data.repository.datasourceimpl

import com.aldeadavila.ecommercemvvm.data.repository.datasource.UsersRemoteDatasource
import com.aldeadavila.ecommercemvvm.data.service.UserService
import com.aldeadavila.ecommercemvvm.domain.model.User
import retrofit2.Response

class UsersRemoteDatasourceImpl(private val userService: UserService): UsersRemoteDatasource {
    override suspend fun update(id: String, user: User): Response<User> = userService.update(id, user)

}