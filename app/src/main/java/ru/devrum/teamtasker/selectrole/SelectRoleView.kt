package ru.devrum.teamtasker.selectrole

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType

@StateStrategyType(value = AddToEndSingleStrategy::class)
interface SelectRoleView:MvpView {
    fun onSelectNewProjectRole()
    fun onSelectJoinProjectRole()
}