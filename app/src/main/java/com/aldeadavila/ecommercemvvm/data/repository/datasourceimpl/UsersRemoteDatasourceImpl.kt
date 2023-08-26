package com.aldeadavila.ecommercemvvm.data.repository.datasourceimpl

import com.aldeadavila.ecommercemvvm.data.repository.datasource.UsersRemoteDatasource
import com.aldeadavila.ecommercemvvm.data.service.UserService
import com.aldeadavila.ecommercemvvm.domain.model.User
import com.aldeadavila.ecommercemvvm.domain.util.Resource
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody.Companion.asRequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import retrofit2.Response
import java.io.File

class UsersRemoteDatasourceImpl(private val userService: UserService): UsersRemoteDatasource {
    override suspend fun update(id: String, user: User): Response<User> = userService.update(id, user)
    override suspend fun updateWithImage(id: String, user: User, file: File): Response<User> {

        val connection = file.toURI().toURL().openConnection()
        val mimeType = connection.contentType // para saber el tipo del archivo
        val contentType = "text/plain"
        val requestFile = file.asRequestBody(mimeType.toMediaTypeOrNull())
        val fileFormData = MultipartBody.Part.createFormData("file", file.name, requestFile)
        val nameData = user.name.toRequestBody(contentType.toMediaTypeOrNull())
        val lastnameData = user.lastname.toRequestBody(contentType.toMediaTypeOrNull())
        val phoneData = user.phone.toRequestBody(contentType.toMediaTypeOrNull())

        return userService.updateWithImage(fileFormData, id, nameData, lastnameData, phoneData)
    }


}