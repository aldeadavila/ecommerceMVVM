package com.aldeadavila.ecommercemvvm.data.repository.datasourceimpl

import com.aldeadavila.ecommercemvvm.data.datastore.AuthDataStore
import com.aldeadavila.ecommercemvvm.data.repository.datasource.AuthLocalDataSource
import com.aldeadavila.ecommercemvvm.domain.model.AuthResponse
import kotlinx.coroutines.flow.Flow
import java.lang.reflect.Constructor

class AuthLocalDataSourceImpl constructor(private val authDataStore: AuthDataStore):AuthLocalDataSource {
    override suspend fun saveSession(authResponse: AuthResponse) = authDataStore.saveUser(authResponse)

    override fun getSessionData(): Flow<AuthResponse> = authDataStore.getData()

}