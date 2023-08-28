package com.aldeadavila.ecommercemvvm.di

import android.app.Application
import androidx.room.Room
import com.aldeadavila.ecommercemvvm.data.datasource.local.dao.CategoriesDao
import com.aldeadavila.ecommercemvvm.data.datasource.local.db.EcommerceDB
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(app: Application): EcommerceDB =
        Room.databaseBuilder(app, EcommerceDB::class.java, "ecommerce_db").fallbackToDestructiveMigration().build()

    @Provides
    fun provideCategoriesDao(db: EcommerceDB): CategoriesDao = db.categoriesDAO()
}