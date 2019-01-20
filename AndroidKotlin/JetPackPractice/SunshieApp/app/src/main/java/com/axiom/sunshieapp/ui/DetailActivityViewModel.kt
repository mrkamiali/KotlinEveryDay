package com.axiom.sunshieapp.ui

import androidx.lifecycle.ViewModel
import com.axiom.sunshieapp.database.WeatherEntry


class DetailActivityViewModel() : ViewModel() {
    // Weather forecast the user is looking at
    private var mWeather: WeatherEntry? = null

    fun getWeather(): WeatherEntry? {
        return mWeather
    }

    fun setWeather(weatherEntry: WeatherEntry) {
        mWeather = weatherEntry
    }
}