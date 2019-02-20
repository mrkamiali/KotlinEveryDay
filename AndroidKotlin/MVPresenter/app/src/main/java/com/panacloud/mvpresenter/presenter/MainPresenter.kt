package com.panacloud.mvpresenter.presenter

import com.panacloud.mvpresenter.MainMVP
import com.panacloud.mvpresenter.interactor.MainInteractor

//3
class MainPresenter(val view: MainMVP.View) : MainMVP.Presenter {
    override fun onButtonClcked() {
        view.setText( "Updated text")
    }

    override fun setNameonTextViewMVPpresenter(s: String) {
        view.setNameonTextView(s)
    }

    val interator = MainInteractor(this)

    override fun setTextinTvPresenter() {
        interator.getUsersFromServer()
    }


}