package com.aldeadavila.ecommercemvvm.data.datasource.local

import com.aldeadavila.ecommercemvvm.data.datasource.local.entity.CategoryEntity
import kotlinx.coroutines.flow.Flow

interface CategoriesLocalDataSource {

    suspend fun create(categoryEntity: CategoryEntity)

    suspend fun insertAll(categoriesEntity:List<CategoryEntity>)
    fun getCategories(): Flow<List<CategoryEntity>>
    suspend fun update(id:String, name:String, description:String, image:String)
    suspend fun delete(id:String)
}