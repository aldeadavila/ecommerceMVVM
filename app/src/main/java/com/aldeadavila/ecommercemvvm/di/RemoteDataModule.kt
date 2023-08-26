package com.aldeadavila.ecommercemvvm.di

import com.aldeadavila.ecommercemvvm.data.repository.datasource.AuthRemoteDatasource
import com.aldeadavila.ecommercemvvm.data.repository.datasource.UsersRemoteDatasource
import com.aldeadavila.ecommercemvvm.data.repository.datasourceimpl.AuthRemoteDatasourceImpl
import com.aldeadavila.ecommercemvvm.data.repository.datasourceimpl.UsersRemoteDatasourceImpl
import com.aldeadavila.ecommercemvvm.data.service.AuthService
import com.aldeadavila.ecommercemvvm.data.service.UserService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RemoteDataModule {

    @Provides
    fun provideAuthRemoteDataSource(authService: AuthService): AuthRemoteDatasource = AuthRemoteDatasourceImpl(authService)
    @Provides
    fun provideUSersRemoteDataSource(userService: UserService): UsersRemoteDatasource = UsersRemoteDatasourceImpl(userService)
}