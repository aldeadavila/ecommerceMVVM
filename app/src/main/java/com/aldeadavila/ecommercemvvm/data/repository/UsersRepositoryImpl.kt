package com.aldeadavila.ecommercemvvm.data.repository

import com.aldeadavila.ecommercemvvm.data.datasource.remote.UsersRemoteDatasource
import com.aldeadavila.ecommercemvvm.domain.model.User
import com.aldeadavila.ecommercemvvm.domain.repository.UsersRepository
import com.aldeadavila.ecommercemvvm.domain.util.Resource
import com.aldeadavila.ecommercemvvm.domain.util.ResponseToRequest
import java.io.File


class UsersRepositoryImpl(
    private val usersRemoteDatasource: UsersRemoteDatasource
    ): UsersRepository {

    override suspend fun update(id: String, user: User): Resource<User> = ResponseToRequest.send(
        usersRemoteDatasource.update(id, user)
    )

    override suspend fun updateWithImage(id: String, user: User, file: File): Resource<User> = ResponseToRequest.send(
        usersRemoteDatasource.updateWithImage(id, user, file)
    )

}