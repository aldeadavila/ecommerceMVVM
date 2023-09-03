package com.aldeadavila.ecommercemvvm.data.repository

import com.aldeadavila.ecommercemvvm.data.datasource.remote.ProductsRemoteDataSource
import com.aldeadavila.ecommercemvvm.domain.model.Product
import com.aldeadavila.ecommercemvvm.domain.repository.ProductsRepository
import com.aldeadavila.ecommercemvvm.domain.util.Resource
import com.aldeadavila.ecommercemvvm.domain.util.ResponseToRequest
import kotlinx.coroutines.flow.Flow
import java.io.File

class ProductsRepositoryImpl(private val productsRemoteDataSource: ProductsRemoteDataSource):ProductsRepository {
    override fun findAll(): Flow<Resource<List<Product>>> {
        TODO("Not yet implemented")
    }

    override fun findByCategory(idCategory: String): Flow<Resource<List<Product>>> {
        TODO("Not yet implemented")
    }

    override suspend fun create(product: Product, files: List<File>): Resource<Product> = ResponseToRequest.send(
        productsRemoteDataSource.create(product, files)
    )

    override suspend fun update(product: Product, files: List<File>?): Resource<Product> {
        TODO("Not yet implemented")
    }

    override suspend fun detele(id: String): Resource<Unit> {
        TODO("Not yet implemented")
    }
}