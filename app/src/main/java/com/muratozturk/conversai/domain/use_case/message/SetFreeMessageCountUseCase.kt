package com.muratozturk.conversai.domain.use_case.message

import com.muratozturk.conversai.domain.repository.PreferenceRepository
import javax.inject.Inject

class SetFreeMessageCountUseCase @Inject constructor(
    private val preferenceRepository: PreferenceRepository
) {
    operator fun invoke(count: Int) = preferenceRepository.setFreeMessageCount(count)
}