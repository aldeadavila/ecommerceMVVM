package com.aldeadavila.ecommercemvvm.di

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.PreferenceDataStoreFactory
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStoreFile
import com.aldeadavila.ecommercemvvm.core.Config
import com.aldeadavila.ecommercemvvm.data.datasource.local.datastore.AuthDataStore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataStoreModule {

    @Provides
    @Singleton
    fun providePreferenceDataStore(@ApplicationContext context: Context): DataStore<Preferences> =
        PreferenceDataStoreFactory.create(
            produceFile = {
                context.preferencesDataStoreFile(Config.AUTH_PREFERENCE)
            }
        )


    @Provides
    @Singleton
    fun provideAuthDataStore(dataStore: DataStore<Preferences>) = AuthDataStore(dataStore)
    }


