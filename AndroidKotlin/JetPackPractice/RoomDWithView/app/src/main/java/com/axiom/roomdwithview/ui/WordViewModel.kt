package com.axiom.roomdwithview.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.axiom.roomdwithview.database.Word
import com.axiom.roomdwithview.database.WordRepository
import com.axiom.roomdwithview.database.WordRoomDatabase
import kotlinx.coroutines.experimental.*
import kotlinx.coroutines.experimental.android.Main
import kotlin.coroutines.CoroutineContext


class WordViewModel(application: Application) : AndroidViewModel(application) {
    private var repository: WordRepository? = null
    var allwords: LiveData<List<Word>>? = null

    private var parentJob = Job()
    private val coroutineContext: kotlin.coroutines.experimental.CoroutineContext
        get() = parentJob + Dispatchers.Main
    private val scope = CoroutineScope(coroutineContext)

    init {
        val wordsDao = WordRoomDatabase.getDatabase(application,scope).getWordDao()
        repository = WordRepository(wordsDao)
        allwords = repository?.allwords
    }

    fun insert(word: Word) = scope.launch(Dispatchers.IO) {
        repository?.insert(word)
    }

    override fun onCleared() {
        super.onCleared()
        parentJob.cancel()
    }
}