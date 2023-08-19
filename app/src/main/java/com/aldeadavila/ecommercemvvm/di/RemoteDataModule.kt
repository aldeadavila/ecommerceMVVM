package com.aldeadavila.ecommercemvvm.di

import com.aldeadavila.ecommercemvvm.data.repository.datasource.AuthRemoteDatasource
import com.aldeadavila.ecommercemvvm.data.repository.datasourceimpl.AuthRemoteDatasourceImpl
import com.aldeadavila.ecommercemvvm.data.service.AuthService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RemoteDataModule {

    @Provides
    fun provideAuthRemoteDataSource(authService: AuthService): AuthRemoteDatasource = AuthRemoteDatasourceImpl(authService)
}