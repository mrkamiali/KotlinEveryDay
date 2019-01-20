package com.axiom.realmexample.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.axiom.realmexample.Movies

@Dao
interface MoviesDao {

    @Insert
    fun insert(movies: Movies)

    @Query("SELECT * FROM movies")
    fun getAll(): List<Movies>

    @Delete
    fun delete(movies: Movies)
}