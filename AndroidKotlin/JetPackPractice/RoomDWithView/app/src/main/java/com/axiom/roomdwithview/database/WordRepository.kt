package com.axiom.roomdwithview.database

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData

class WordRepository(private val wordDao: WordDao) {

    val allwords: LiveData<List<Word>> = wordDao.getAllwords()

    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}