package com.axiom.realmexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import com.axiom.realmexample.db.MoviesDatabase

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val db = Room.databaseBuilder(
            this@MainActivity,
            MoviesDatabase::class.java, "database-movies"
        ).allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build()


        db.getMoviesDao().insert(Movies(0, "KARACHI", "DESC"))


        println(db.getMoviesDao().getAll())



    }
}
