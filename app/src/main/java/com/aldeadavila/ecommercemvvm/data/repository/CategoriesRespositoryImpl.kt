package com.aldeadavila.ecommercemvvm.data.repository

import com.aldeadavila.ecommercemvvm.data.repository.datasource.CategoriesRemoteDatasource
import com.aldeadavila.ecommercemvvm.domain.model.Category
import com.aldeadavila.ecommercemvvm.domain.repository.CategoriesRepository
import com.aldeadavila.ecommercemvvm.domain.util.Resource
import com.aldeadavila.ecommercemvvm.domain.util.ResponseToRequest
import kotlinx.coroutines.cancel
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import java.io.File

class CategoriesRespositoryImpl(private val categoriesRemoteDatasource: CategoriesRemoteDatasource): CategoriesRepository {
    override suspend fun create(category: Category, file: File): Resource<Category> = ResponseToRequest.send(
        categoriesRemoteDatasource.create(category, file)

    )

    override fun getCategories(): Flow<Resource<List<Category>>> = callbackFlow {
        trySend(ResponseToRequest.send(categoriesRemoteDatasource.getCategories()))
        awaitClose {
           cancel()
        }
    }

    override suspend fun update(id: String, category: Category): Resource<Category> {
        TODO("Not yet implemented")
    }

    override suspend fun updateWithImage(
        id: String,
        category: Category,
        file: File
    ): Resource<Category> {
        TODO("Not yet implemented")
    }

    override suspend fun delete(id: String): Resource<Unit> {
        TODO("Not yet implemented")
    }
}