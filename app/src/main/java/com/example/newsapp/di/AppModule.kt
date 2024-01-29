package com.example.newsapp.di

import android.app.Application
import com.example.newsapp.data.manger.LocalUserMangerImpl
import com.example.newsapp.domain.manger.LocalUserManger
import com.example.newsapp.domain.use_cases.app_entry.AppEntryUseCases
import com.example.newsapp.domain.use_cases.app_entry.ReadAppEntry
import com.example.newsapp.domain.use_cases.app_entry.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocalUserManger(application: Application): LocalUserManger {
        return LocalUserMangerImpl(application)
    }

    @Provides
    @Singleton
    fun provideAppEntryUseCases(localUserManger: LocalUserManger): AppEntryUseCases {
        return AppEntryUseCases(
            readAppEntry = ReadAppEntry(localUserManger),
            saveAppEntry = SaveAppEntry(localUserManger)
        )
    }
}