package com.aldeadavila.ecommercemvvm.di

import com.aldeadavila.ecommercemvvm.data.repository.datasource.AuthRemoteDatasource
import com.aldeadavila.ecommercemvvm.data.repository.datasourceimpl.AuthRemoteDatasourceImpl
import com.aldeadavila.ecommercemvvm.data.service.AuthService
import com.aldeadavila.ecommercemvvm.domain.repository.AuthRepository
import com.aldeadavila.ecommercemvvm.domain.usecase.auth.AuthUseCase
import com.aldeadavila.ecommercemvvm.domain.usecase.auth.GetSessionDataUseCase
import com.aldeadavila.ecommercemvvm.domain.usecase.auth.LoginUseCase
import com.aldeadavila.ecommercemvvm.domain.usecase.auth.LogoutUseCase
import com.aldeadavila.ecommercemvvm.domain.usecase.auth.RegisterUseCase
import com.aldeadavila.ecommercemvvm.domain.usecase.auth.SaveSessionUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideAuthUseCase(authRepository: AuthRepository) = AuthUseCase(
        login = LoginUseCase(authRepository),
        register = RegisterUseCase(authRepository),
        saveSession = SaveSessionUseCase(authRepository),
        getSessionData = GetSessionDataUseCase(authRepository),
        logout = LogoutUseCase(authRepository)
    )
}