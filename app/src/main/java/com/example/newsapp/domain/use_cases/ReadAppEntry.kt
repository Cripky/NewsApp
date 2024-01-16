package com.example.newsapp.domain.use_cases

import com.example.newsapp.domain.manger.LocalUserManger
import kotlinx.coroutines.flow.Flow

class ReadAppEntry(
    private val localUserManger: LocalUserManger
) {

    suspend operator fun invoke(): Flow<Boolean> {
        return localUserManger.readAppEntry()
    }
}