package com.muratozturk.conversai.domain.repository

import com.muratozturk.conversai.data.model.TextCompletionsParam
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow

interface ChatRepository {
    fun textCompletionsWithStream(scope: CoroutineScope, params: TextCompletionsParam): Flow<String>
}