package com.example.newsapp.domain.use_cases.app_entry

import com.example.newsapp.domain.manger.LocalUserManger
import javax.inject.Inject

class SaveAppEntry @Inject constructor(
    private val localUserManger: LocalUserManger
) {

    suspend operator fun invoke() {
        localUserManger.saveAppEntry()
    }
}