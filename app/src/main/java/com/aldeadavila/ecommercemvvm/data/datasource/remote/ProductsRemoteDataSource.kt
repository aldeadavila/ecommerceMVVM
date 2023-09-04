package com.aldeadavila.ecommercemvvm.data.datasource.remote

import com.aldeadavila.ecommercemvvm.domain.model.Product
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import java.io.File

interface ProductsRemoteDataSource {

    suspend fun findAll(): Flow<Response<List<Product>>>
    suspend fun findByCategory(idCategory: String): Response<List<Product>>
    suspend fun create(product: Product, files: List<File>): Response<Product>
    suspend fun updateWithImage(id:String, product: Product, files: List<File>?): Response<Product>
    suspend fun update(id:String, product: Product): Response<Product>
    suspend fun detele(id: String): Response<Unit>
}