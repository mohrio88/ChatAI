package com.muratozturk.conversai.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.muratozturk.conversai.data.model.ConversationModel
import com.muratozturk.conversai.data.model.MessageModel

@Database(
    entities = [ConversationModel::class, MessageModel::class],
    version = 1,
    exportSchema = false
)
abstract class ConversAIDatabase : RoomDatabase() {
    abstract fun conversAIDao(): ConversAIDao
}