package com.aldeadavila.ecommercemvvm.di

import com.aldeadavila.ecommercemvvm.data.datasource.remote.AuthRemoteDatasource
import com.aldeadavila.ecommercemvvm.data.datasource.remote.CategoriesRemoteDatasource
import com.aldeadavila.ecommercemvvm.data.datasource.remote.UsersRemoteDatasource
import com.aldeadavila.ecommercemvvm.data.datasource.remote.AuthRemoteDatasourceImpl
import com.aldeadavila.ecommercemvvm.data.datasource.remote.CategoriesRemoteDatasourceImpl
import com.aldeadavila.ecommercemvvm.data.datasource.remote.ProductsRemoteDataSource
import com.aldeadavila.ecommercemvvm.data.datasource.remote.ProductsRemoteDataSourceImpl
import com.aldeadavila.ecommercemvvm.data.datasource.remote.UsersRemoteDatasourceImpl
import com.aldeadavila.ecommercemvvm.data.datasource.remote.service.AuthService
import com.aldeadavila.ecommercemvvm.data.datasource.remote.service.CategoryService
import com.aldeadavila.ecommercemvvm.data.datasource.remote.service.ProductsService
import com.aldeadavila.ecommercemvvm.data.datasource.remote.service.UserService
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
    fun provideUsersRemoteDataSource(userService: UserService): UsersRemoteDatasource = UsersRemoteDatasourceImpl(userService)
    @Provides
    fun provideCategoriesRemoteDataSource(categoryService: CategoryService): CategoriesRemoteDatasource = CategoriesRemoteDatasourceImpl(categoryService)
    @Provides
    fun provideProductsRemoteDataSource(productsService: ProductsService): ProductsRemoteDataSource = ProductsRemoteDataSourceImpl(productsService)


}