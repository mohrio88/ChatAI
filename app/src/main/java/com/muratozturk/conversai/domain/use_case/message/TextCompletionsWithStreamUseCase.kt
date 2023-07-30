package com.muratozturk.conversai.domain.use_case.message

import com.muratozturk.conversai.data.model.TextCompletionsParam
import com.muratozturk.conversai.domain.repository.ChatRepository
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject

class TextCompletionsWithStreamUseCase @Inject constructor(
    private val chatRepository: ChatRepository
) {
    operator fun invoke(scope: CoroutineScope, params: TextCompletionsParam) =
        chatRepository.textCompletionsWithStream(scope, params)
}