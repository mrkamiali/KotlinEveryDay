package com.kotlinapp.chatapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SigninActivity : AppCompatActivity() {

    private var email: String? = null
    private var pasword: String? = null

    private lateinit var emailEt: EditText
    private lateinit var paswordEt: EditText
    private lateinit var signInBtn: Button
    private lateinit var signUpBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        emailEt = findViewById<View>(R.id.emailEt) as EditText
        paswordEt = findViewById<View>(R.id.passEt) as EditText
        signInBtn = findViewById<View>(R.id.signInBtn) as Button
        signUpBtn = findViewById<View>(R.id.signUpBtn) as Button

        email = emailEt.text.toString()
        pasword = paswordEt.text.toString()
        signInBtn.setOnClickListener(View.OnClickListener {
            if (email!!.length > 0 && pasword!!.length > 0) {

            } else{
                Toast.makeText(this,"enter all fields",Toast.LENGTH_LONG)
            }
        })

        signUpBtn.setOnClickListener({
            if (email!!.length > 0 && pasword!!.length > 0) {

            } else{
                Toast.makeText(this,"enter all fields",Toast.LENGTH_LONG)
            }
        })


    }
}
