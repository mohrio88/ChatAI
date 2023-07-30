package com.muratozturk.conversai.data.repository

import com.muratozturk.conversai.data.model.MessageModel
import com.muratozturk.conversai.data.source.local.ConversAIDao
import com.muratozturk.conversai.domain.repository.MessageRepository
import javax.inject.Inject

class MessageRepositoryImpl @Inject constructor(
    private val conversAIDao: ConversAIDao,
) : MessageRepository {
    override suspend fun getMessages(conversationId: String): List<MessageModel> =
        conversAIDao.getMessages(conversationId)

    override suspend fun addMessage(message: MessageModel) =
        conversAIDao.addMessage(message)

    override suspend fun deleteMessages(conversationId: String) =
        conversAIDao.deleteMessages(conversationId)
}