package com.aldeadavila.ecommercemvvm.di

import com.aldeadavila.ecommercemvvm.data.datastore.AuthDataStore
import com.aldeadavila.ecommercemvvm.data.repository.datasource.AuthLocalDataSource
import com.aldeadavila.ecommercemvvm.data.repository.datasource.AuthRemoteDatasource
import com.aldeadavila.ecommercemvvm.data.repository.datasourceimpl.AuthLocalDataSourceImpl
import com.aldeadavila.ecommercemvvm.data.repository.datasourceimpl.AuthRemoteDatasourceImpl
import com.aldeadavila.ecommercemvvm.data.service.AuthService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object LocalDataModule {

    @Provides
    fun provideAuthLocalDataSource(authDataStore: AuthDataStore): AuthLocalDataSource = AuthLocalDataSourceImpl(authDataStore)
}