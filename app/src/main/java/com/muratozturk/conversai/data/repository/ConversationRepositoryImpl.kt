package com.muratozturk.conversai.data.repository

import com.muratozturk.conversai.data.model.ConversationModel
import com.muratozturk.conversai.data.source.local.ConversAIDao
import com.muratozturk.conversai.domain.repository.ConversationRepository
import javax.inject.Inject


class ConversationRepositoryImpl @Inject constructor(
    private val conversAIDao: ConversAIDao

) : ConversationRepository {
    override suspend fun getConversations(): MutableList<ConversationModel> =
        conversAIDao.getConversations()

    override suspend fun addConversation(conversation: ConversationModel) =
        conversAIDao.addConversation(conversation)

    override suspend fun deleteConversation(conversationId: String) {
        conversAIDao.deleteConversation(conversationId)
        conversAIDao.deleteMessages(conversationId)
    }


    override suspend fun deleteAllConversation() = conversAIDao.deleteAllConversation()

}