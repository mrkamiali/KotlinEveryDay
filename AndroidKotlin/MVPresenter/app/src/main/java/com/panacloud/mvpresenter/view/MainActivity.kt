package com.panacloud.mvpresenter.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.panacloud.mvpresenter.MainMVP
import com.panacloud.mvpresenter.R
import com.panacloud.mvpresenter.presenter.MainPresenter
import kotlinx.android.synthetic.main.activity_main.*

//2
class MainActivity : AppCompatActivity(), MainMVP.View {
    override fun setText(string: String) {
        helloTextView.text = string
    }

    //4
    val mPresenter: MainPresenter by lazy { MainPresenter(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            //5
            mPresenter.onButtonClcked()
        }

    }

    override fun setNameonTextView(name: String) {
        helloTextView.text = name
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}
