package com.panacloud.mvpresenter

import android.view.View

//1
class MainMVP {
    interface View {
        fun setNameonTextView(name: String)
        fun setText(string: String)
    }

    interface Presenter {
        fun setTextinTvPresenter()
        fun setNameonTextViewMVPpresenter(s: String)
        fun onButtonClcked()
    }

    interface Interactor {
        fun getUsersFromServer()
    }
}