package com.muratozturk.conversai.domain.use_case.profile

import com.muratozturk.conversai.domain.repository.PreferenceRepository
import javax.inject.Inject

class GetDarkModeUseCase @Inject constructor(
    private val preferenceRepository: PreferenceRepository
) {
    operator fun invoke() = preferenceRepository.getDarkMode()
}