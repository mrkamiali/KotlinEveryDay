package com.panacloud.mvpresenter.interactor

import com.panacloud.mvpresenter.presenter.MainMVP

class MainInteractor(val presenter:MainMVP.Presenter): MainMVP.Interactor {
    override fun getUsersFromServer() {
        presenter.setNameonTextViewMVPpresenter("Kamran")
    }
}