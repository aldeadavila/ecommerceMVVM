package com.aldeadavila.ecommercemvvm.data.datasource.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.aldeadavila.ecommercemvvm.data.datasource.local.dao.CategoriesDao
import com.aldeadavila.ecommercemvvm.data.datasource.local.dao.ProductsDao
import com.aldeadavila.ecommercemvvm.data.datasource.local.entity.CategoryEntity
import com.aldeadavila.ecommercemvvm.data.datasource.local.entity.ProductEntity

@Database(
    entities = [CategoryEntity::class, ProductEntity::class],
    version = 1,
    exportSchema = false
)
abstract class EcommerceDB: RoomDatabase() {

    abstract fun categoriesDAO(): CategoriesDao
    abstract fun productsDAO(): ProductsDao
}