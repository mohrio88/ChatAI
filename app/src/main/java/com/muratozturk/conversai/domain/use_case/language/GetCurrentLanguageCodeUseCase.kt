package com.muratozturk.conversai.domain.use_case.language

import com.muratozturk.conversai.domain.repository.PreferenceRepository
import javax.inject.Inject

class GetCurrentLanguageCodeUseCase @Inject constructor(private val preferenceRepository: PreferenceRepository) {
    operator fun invoke() = preferenceRepository.getCurrentLanguageCode()
}