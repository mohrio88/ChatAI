package com.muratozturk.conversai.domain.use_case.app

import com.muratozturk.conversai.domain.repository.FirebaseRepository
import javax.inject.Inject

class IsThereUpdateUseCase @Inject constructor(private val firebaseRepository: FirebaseRepository) {
    operator suspend fun invoke(): Boolean {
        return firebaseRepository.isThereUpdate()
    }
}