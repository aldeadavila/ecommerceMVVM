package com.aldeadavila.ecommercemvvm.data.service

import com.aldeadavila.ecommercemvvm.domain.model.User
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface UserService {

    @PUT("users/{id}")
    suspend fun update(
        @Path("id") id: String,
        @Body() user:User
    ): Response<User>
}