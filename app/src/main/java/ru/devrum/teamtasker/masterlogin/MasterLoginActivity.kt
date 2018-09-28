package ru.devrum.teamtasker.masterlogin

import android.os.Bundle
import com.arellomobile.mvp.MvpAppCompatActivity
import ru.devrum.teamtasker.R

class MasterLoginActivity : MvpAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_master_login)
    }
}
