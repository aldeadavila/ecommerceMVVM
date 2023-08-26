package com.aldeadavila.ecommercemvvm.di

import com.aldeadavila.ecommercemvvm.data.repository.AuthRepositoryImpl
import com.aldeadavila.ecommercemvvm.data.repository.UsersRepositoryImpl
import com.aldeadavila.ecommercemvvm.data.repository.datasource.AuthLocalDataSource
import com.aldeadavila.ecommercemvvm.data.repository.datasource.AuthRemoteDatasource
import com.aldeadavila.ecommercemvvm.data.repository.datasource.UsersRemoteDatasource
import com.aldeadavila.ecommercemvvm.data.repository.datasourceimpl.AuthRemoteDatasourceImpl
import com.aldeadavila.ecommercemvvm.data.service.AuthService
import com.aldeadavila.ecommercemvvm.domain.repository.AuthRepository
import com.aldeadavila.ecommercemvvm.domain.repository.UsersRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    fun provideAuthRepository(
        authRemoteDatasource: AuthRemoteDatasource,
        authLocalDataSource: AuthLocalDataSource
    ): AuthRepository = AuthRepositoryImpl(authRemoteDatasource, authLocalDataSource)

    @Provides
    fun provideUserRepository(
        usersRemoteDatasource: UsersRemoteDatasource
    ): UsersRepository = UsersRepositoryImpl(usersRemoteDatasource)
}