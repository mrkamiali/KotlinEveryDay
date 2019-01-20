package com.axiom.realmexample.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.axiom.realmexample.Movies

@Database(entities = arrayOf(Movies::class), version = 1)
abstract class MoviesDatabase : RoomDatabase() {
    abstract fun getMoviesDao(): MoviesDao
}