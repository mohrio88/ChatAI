package com.muratozturk.conversai.domain.use_case.message

import com.muratozturk.conversai.data.model.MessageModel
import com.muratozturk.conversai.domain.repository.MessageRepository
import javax.inject.Inject

class CreateMessagesUseCase @Inject constructor(
    private val messageRepository: MessageRepository
) {
    suspend operator fun invoke(message: MessageModel) =
        messageRepository.addMessage(message)
}