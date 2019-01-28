package com.panacloud.mvpresenter.presenter

import android.view.View

//1
class MainMVP {
    interface View{
        fun setNameonTextView(name:String)
    }
    interface Presenter{
        fun setTextinTvPresenter()
        fun setNameonTextViewMVPpresenter(s: String)

    }
    interface Interactor{
        fun getUsersFromServer()
    }
}