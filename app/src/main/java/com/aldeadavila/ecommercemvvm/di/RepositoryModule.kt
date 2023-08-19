package com.aldeadavila.ecommercemvvm.di

import com.aldeadavila.ecommercemvvm.data.repository.AuthRepositoryImpl
import com.aldeadavila.ecommercemvvm.data.repository.datasource.AuthRemoteDatasource
import com.aldeadavila.ecommercemvvm.data.repository.datasourceimpl.AuthRemoteDatasourceImpl
import com.aldeadavila.ecommercemvvm.data.service.AuthService
import com.aldeadavila.ecommercemvvm.domain.repository.AuthRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    fun provideAuthRepository(authRemoteDatasource: AuthRemoteDatasource): AuthRepository = AuthRepositoryImpl(authRemoteDatasource)
}