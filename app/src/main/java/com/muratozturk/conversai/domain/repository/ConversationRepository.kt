package com.muratozturk.conversai.domain.repository

import com.muratozturk.conversai.data.model.ConversationModel

interface ConversationRepository {
    suspend fun getConversations(): MutableList<ConversationModel>
    suspend fun addConversation(conversation: ConversationModel)
    suspend fun deleteConversation(conversationId: String)
    suspend fun deleteAllConversation()
}