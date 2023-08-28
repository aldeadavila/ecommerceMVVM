package com.aldeadavila.ecommercemvvm.data.datasource.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.aldeadavila.ecommercemvvm.data.datasource.local.dao.CategoriesDao
import com.aldeadavila.ecommercemvvm.data.datasource.local.entity.CategoryEntity

@Database(
    entities = [CategoryEntity::class],
    version = 1,
    exportSchema = false
)
abstract class EcommerceDB: RoomDatabase() {

    abstract fun categoriesDAO(): CategoriesDao
}