package com.aldeadavila.ecommercemvvm.di

import com.aldeadavila.ecommercemvvm.data.datasource.local.datastore.AuthDataStore
import com.aldeadavila.ecommercemvvm.data.datasource.local.AuthLocalDataSource
import com.aldeadavila.ecommercemvvm.data.datasource.local.AuthLocalDataSourceImpl
import com.aldeadavila.ecommercemvvm.data.datasource.local.CategoriesLocalDataSource
import com.aldeadavila.ecommercemvvm.data.datasource.local.CategoriesLocalDataSourceImpl
import com.aldeadavila.ecommercemvvm.data.datasource.local.ProductsLocalDataSource
import com.aldeadavila.ecommercemvvm.data.datasource.local.ProductsLocalDataSourceImpl
import com.aldeadavila.ecommercemvvm.data.datasource.local.dao.CategoriesDao
import com.aldeadavila.ecommercemvvm.data.datasource.local.dao.ProductsDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object LocalDataModule {

    @Provides
    fun provideAuthLocalDataSource(authDataStore: AuthDataStore): AuthLocalDataSource = AuthLocalDataSourceImpl(authDataStore)

    @Provides
    fun provideCategoriesLocalDataSource(categoriesDao: CategoriesDao): CategoriesLocalDataSource = CategoriesLocalDataSourceImpl(categoriesDao)

    @Provides
    fun provideProductsLocalDataSource(productsDao: ProductsDao): ProductsLocalDataSource = ProductsLocalDataSourceImpl(productsDao)
}