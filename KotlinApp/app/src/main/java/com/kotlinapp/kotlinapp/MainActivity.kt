package com.kotlinapp.kotlinapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    kotlinx.android.synthetic.main.<layout filename>.<id of view>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    fun randomMe (view: View) {
        // Create an Intent to start the second activity
        val randomIntent = Intent(this, SecondActivity::class.java)

        // Get the current value of the text view.
        val countString = textView.text.toString()

        // Convert the count to an int
        val count = Integer.parseInt(countString)

        // Add the count to the extras for the Intent.
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)

        // Start the new activity.
        startActivity(randomIntent)
    }
    fun toastMe(view: View){
        Toast.makeText(this,"Hello TOast", Toast.LENGTH_LONG).show();

    }
    fun countMe (view: View) {

        val countString = textView.text.toString()
        var toInt:Int = Integer.parseInt(countString)
        toInt++
        textView.setText(toInt)
    }
}
