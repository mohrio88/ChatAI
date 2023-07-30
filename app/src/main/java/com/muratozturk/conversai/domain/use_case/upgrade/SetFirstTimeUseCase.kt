package com.muratozturk.conversai.domain.use_case.upgrade

import com.muratozturk.conversai.domain.repository.PreferenceRepository
import javax.inject.Inject

class SetFirstTimeUseCase @Inject constructor(
    private val preferenceRepository: PreferenceRepository
) {
    operator fun invoke(isFirstTime: Boolean) = preferenceRepository.setFirstTime(isFirstTime)
}
