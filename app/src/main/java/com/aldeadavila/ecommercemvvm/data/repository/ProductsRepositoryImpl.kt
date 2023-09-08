package com.aldeadavila.ecommercemvvm.data.repository

import com.aldeadavila.ecommercemvvm.data.datasource.remote.ProductsRemoteDataSource
import com.aldeadavila.ecommercemvvm.domain.model.Product
import com.aldeadavila.ecommercemvvm.domain.repository.ProductsRepository
import com.aldeadavila.ecommercemvvm.domain.util.Resource
import com.aldeadavila.ecommercemvvm.domain.util.ResponseToRequest
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.File

class ProductsRepositoryImpl(private val productsRemoteDataSource: ProductsRemoteDataSource):ProductsRepository {
    override fun findAll(): Flow<Resource<List<Product>>> {
        TODO("Not yet implemented")
    }

    override fun findByCategory(idCategory: String): Flow<Resource<List<Product>>> = flow {
        emit(
            ResponseToRequest.send(productsRemoteDataSource.findByCategory(idCategory))
        )
    }


    override suspend fun create(product: Product, files: List<File>): Resource<Product> = ResponseToRequest.send(
        productsRemoteDataSource.create(product, files)
    )

    override suspend fun updateWithImage(id:String, product: Product, files: List<File>?): Resource<Product> = ResponseToRequest.send(
        productsRemoteDataSource.updateWithImage(id, product, files)
    )

    override suspend fun update(id: String, product: Product): Resource<Product> = ResponseToRequest.send(
        productsRemoteDataSource.update(id, product)
    )

    override suspend fun detele(id: String): Resource<Unit> = ResponseToRequest.send(
        productsRemoteDataSource.detele(id)
    )
}