package com.realmexample

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.annotation.TargetApi
import android.content.Intent
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.realmexample.constants.Constants
import io.realm.ObjectServerError
import io.realm.Realm
import io.realm.SyncCredentials
import io.realm.SyncUser

class MainActivity : AppCompatActivity() {

    private var nicknameView: EditText? = null
    private var progressView: View? = null
    private var loginFormView: View? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (SyncUser.current() != null) {
            setUpRealmAndGoToTaskListActivity()
        }

        // Set up the login form.
        nicknameView = findViewById<EditText>(R.id.nickname)
        val loginButton = findViewById<Button>(R.id.login_button)
        loginButton.setOnClickListener { view -> attemptLogin() }
        loginFormView = findViewById<View>(R.id.login_form)
        progressView = findViewById<View>(R.id.login_progress)
    }

    private fun attemptLogin() {
        // Reset errors.
        nicknameView?.setError(null)
        // Store values at the time of the login attempt.
        val nickname = nicknameView?.getText().toString()
        showProgress(true)

        val credentials = SyncCredentials.nickname(nickname, true)
        SyncUser.logInAsync(credentials, Constants.AUTH_URL, object : SyncUser.Callback<SyncUser> {
            override fun onSuccess(user: SyncUser) {
                showProgress(false)
                setUpRealmAndGoToTaskListActivity()
            }

            override fun onError(error: ObjectServerError) {
                showProgress(false)
                nicknameView?.setError("Uh oh something went wrong! (check your logcat please)")
                nicknameView?.requestFocus()
                Log.e("Login error", error.toString())
            }
        })
    }

    /**
     * Shows the progress UI and hides the login form.
     */
    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR2)
    private fun showProgress(show: Boolean) {
        val shortAnimTime = resources.getInteger(android.R.integer.config_shortAnimTime)
        loginFormView?.setVisibility(if (show) View.GONE else View.VISIBLE)
        loginFormView!!.animate().setDuration(shortAnimTime.toLong()).alpha(
            (if (show) 0 else 1).toFloat()
        ).setListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator) {
                loginFormView?.setVisibility(if (show) View.GONE else View.VISIBLE)
            }
        })
        progressView!!.setVisibility(if (show) View.VISIBLE else View.GONE)
        progressView!!.animate().setDuration(shortAnimTime.toLong()).alpha(
            (if (show) 1 else 0).toFloat()
        ).setListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator) {
                progressView!!.setVisibility(if (show) View.VISIBLE else View.GONE)
            }
        })
    }

    private fun setUpRealmAndGoToTaskListActivity() {
        val configuration = SyncUser.current().defaultConfiguration
        Realm.setDefaultConfiguration(configuration)
        val intent = Intent(this@MainActivity, ProjectActivity::class.java)
        startActivity(intent)
    }
}
