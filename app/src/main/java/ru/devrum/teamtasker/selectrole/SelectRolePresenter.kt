package ru.devrum.teamtasker.selectrole

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter

@InjectViewState
class SelectRolePresenter:MvpPresenter<SelectRoleView>() {

    fun onCreateNewProject() {
        viewState.onSelectNewProjectRole()
    }

    fun onJoinProject() {
        viewState.onSelectJoinProjectRole()
    }
}