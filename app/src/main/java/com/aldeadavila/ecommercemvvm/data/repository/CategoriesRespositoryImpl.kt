package com.aldeadavila.ecommercemvvm.data.repository

import com.aldeadavila.ecommercemvvm.data.datasource.local.CategoriesLocalDataSource
import com.aldeadavila.ecommercemvvm.data.datasource.remote.CategoriesRemoteDatasource
import com.aldeadavila.ecommercemvvm.data.mapper.toCategory
import com.aldeadavila.ecommercemvvm.data.mapper.toCategoryEntity
import com.aldeadavila.ecommercemvvm.domain.model.Category
import com.aldeadavila.ecommercemvvm.domain.repository.CategoriesRepository
import com.aldeadavila.ecommercemvvm.domain.util.Resource
import com.aldeadavila.ecommercemvvm.domain.util.ResponseToRequest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import java.io.File

class CategoriesRespositoryImpl(
    private val remoteDatasource: CategoriesRemoteDatasource,
    private val localDataSource: CategoriesLocalDataSource
): CategoriesRepository {
    override suspend fun create(category: Category, file: File): Resource<Category> = ResponseToRequest.send(
        remoteDatasource.create(category, file)

    )

    override fun getCategories(): Flow<Resource<List<Category>>> = flow {

        localDataSource.getCategories().collect() {
            it.run {
                if (this.isNotEmpty()) {
                    emit(Resource.Succes(this.map{ categoryEntity -> categoryEntity.toCategory()  }))
                }
                else {
                    ResponseToRequest.send(remoteDatasource.getCategories()).run {
                        when(this) {
                            is Resource.Succes -> {
                                localDataSource.insertAll(this.data.map { category ->  category.toCategoryEntity()})
                                emit(Resource.Succes(this.data))
                            }
                            else -> {}
                        }
                    }
                }
            }
        }

    }.flowOn(Dispatchers.IO)


    override suspend fun update(id: String, category: Category): Resource<Category> {

        ResponseToRequest.send(remoteDatasource.update(id, category)).run {
            return when(this) {
                is Resource.Succes -> {
                    localDataSource.update(
                        id = this.data.id ?: "",
                        name = this.data.name,
                        description = this.data.description,
                        image = this.data.image ?: ""
                    )
                    Resource.Succes(this.data)
                }
                else -> {
                    Resource.Failure("Error desconocido")
                }
            }
        }
    }

    override suspend fun updateWithImage(
        id: String,
        category: Category,
        file: File
    ): Resource<Category> = ResponseToRequest.send(
        remoteDatasource.updateWithImage(id, category, file)
    )

    override suspend fun delete(id: String): Resource<Unit> {
        TODO("Not yet implemented")
    }
}