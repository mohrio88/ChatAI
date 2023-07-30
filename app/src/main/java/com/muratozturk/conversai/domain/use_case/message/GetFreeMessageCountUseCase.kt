package com.muratozturk.conversai.domain.use_case.message

import com.muratozturk.conversai.domain.repository.PreferenceRepository
import javax.inject.Inject

class GetFreeMessageCountUseCase @Inject constructor(
    private val preferenceRepository: PreferenceRepository
) {
    operator fun invoke() = preferenceRepository.getFreeMessageCount()
}