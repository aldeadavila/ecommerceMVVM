package com.aldeadavila.ecommercemvvm.data.repository

import com.aldeadavila.ecommercemvvm.data.repository.datasource.AuthRemoteDatasource
import com.aldeadavila.ecommercemvvm.domain.model.AuthResponse
import com.aldeadavila.ecommercemvvm.domain.model.ErrorResponse
import com.aldeadavila.ecommercemvvm.domain.repository.AuthRepository
import com.aldeadavila.ecommercemvvm.domain.util.ConvertErrorBody
import com.aldeadavila.ecommercemvvm.domain.util.Resource
import retrofit2.HttpException
import java.io.IOException

class AuthRepositoryImpl(private val authRemoteDatasource: AuthRemoteDatasource): AuthRepository {
    override suspend fun login(email: String, password: String): Resource<AuthResponse> {
        return try {
            val result = authRemoteDatasource.login(email, password)
            if (result.isSuccessful) {
                Resource.Succes(result.body()!!)
            } else {
                val errorResponse: ErrorResponse? = ConvertErrorBody.convert(result.errorBody())
                Resource.Failure(errorResponse?.message ?: "Error desconocido")
            }

        }
        catch (e: HttpException) {
            Resource.Failure(e.message ?: "Error desconocido en la petición Http")
        }
        catch (e: IOException) {
            e.printStackTrace()
            Resource.Failure(
                "Verifica tu conexión a Internet")
        }
        catch (e: Exception) {
            e.printStackTrace()
            Resource.Failure(e.message ?: "Error desconocido")
        }
    }

}