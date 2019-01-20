package com.axiom.sunshieapp.database

import android.content.Context
import androidx.room.*


@Database(entities = arrayOf(WeatherEntry::class), version = 1)
@TypeConverters(DateConverter::class)
abstract class SunshineDatabase : RoomDatabase() {
    abstract fun weatherDao(): WeatherDao


    //Create Sunshine a singlton class
    private val DATABASE_NAME = "weather"
    // For Singleton instantiation
    private val LOCK = Any()
    @Volatile
    private var sInstance: SunshineDatabase? = null

    fun getInstance(context: Context): SunshineDatabase? {
        if (sInstance == null) {
            synchronized(LOCK) {
                if (sInstance == null) {
                    sInstance = Room.databaseBuilder(
                        context.getApplicationContext(),
                        SunshineDatabase::class.java, DATABASE_NAME
                    ).build()
                }
            }
        }
        return sInstance
    }
}