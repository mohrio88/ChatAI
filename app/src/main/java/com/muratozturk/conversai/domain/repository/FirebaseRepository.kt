package com.muratozturk.conversai.domain.repository

interface FirebaseRepository {
    suspend fun isThereUpdate(): Boolean
}