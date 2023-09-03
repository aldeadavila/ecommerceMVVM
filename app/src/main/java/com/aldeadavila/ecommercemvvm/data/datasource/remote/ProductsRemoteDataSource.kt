package com.aldeadavila.ecommercemvvm.data.datasource.remote

import com.aldeadavila.ecommercemvvm.domain.model.Product
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import java.io.File

interface ProductsRemoteDataSource {

    fun findAll(): Flow<Response<List<Product>>>
    fun findByCategory(idCategory: String): Response<List<Product>>
    suspend fun create(product: Product, files: List<File>): Response<Product>
    suspend fun update(product: Product, files: List<File>?): Response<Product>
    suspend fun detele(id: String): Response<Unit>
}